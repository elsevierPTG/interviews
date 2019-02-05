var API = API || {};


// default values, can be overridden in 
// main document

API.baseURI = 'https://example.com/path/to/api'

const apiFetch = path => {
	return fetch(
		API.baseURI + path,
		{
			headers: {'Accept': 'application/json-fhir'}
		}
	).then(obj => obj.json())
}

const getPatients = q => {
	const path = '/Patient?name=' + encodeURIComponent(q);
	return new Promise(
		resolve => {
			apiFetch(path).then(
				obj => {
					let patients = [];
					if (obj.total === 0) {
						resolve([])
					} else {
						obj.entry.forEach(patient => patients.push({
							name: patient.resource.name[0].text,
							id: patient.resource.id,
							gender: patient.resource.gender,
							birthDate: patient.resource.birthDate ? new Date(Date.parse(patient.resource.birthDate)) : null
						}))
					}
					resolve(patients);
				}
			)
		}
	)
}

const getPatient = id => {
	const path = '/Patient/' + id;
	return new Promise(
		resolve => {
			apiFetch(path).then(
				obj => {
					let patient = {},
						curName = obj.name[0]
					patient.id = obj.id
					patient.first = curName.given[0]
					if (curName.given.length > 1) {
						// current implementation handles just one middle name
						patient.middle = curName.given[1]
					}
					patient.displayName = curName.text
					patient.last = curName.family[0]
					patient.birthDate = obj.birthDate ? new Date(Date.parse(obj.birthDate)) : null
					patient.gender = obj.gender
					resolve(patient)
				}
			)
		}
	)
}

const getConditions = patient => {
	if (patient.id) {
		patient = patient.id
	}
	let path = '/Condition?patient=' + patient
	return new Promise(
		resolve => {
			apiFetch(path).then(
				obj => {
					var conditions = [];
					if (!obj.total) {
						resolve([])
					} else {
						obj.entry.forEach(condition => conditions.push({
							name: condition.resource.code.text,
							dateRecorded: condition.resource.dateRecorded ? new Date(Date.parse(condition.resource.dateRecorded)) : null,
							verificationStatus: condition.resource.verificationStatus,
							started: condition.resource.onsetDateTime ? new Date(Date.parse(condition.resource.onsetDateTime)) : null,
							ended: condition.resource.abatementDateTime ? new Date(Date.parse(condition.resource.abatementDateTime)): null
						}))
					}
					resolve(conditions);
				}
			)
		}
	)
}

// was never a real condition
const isValidCondition = (condition, index, array) => (!condition.verificationStatus || condition.verificationStatus !== 'entered-in-error')

// no longer active
const isActiveCondition = (condition, index, array) => { return !condition.ended }

const getActiveConditions = patient => {
	return new Promise(
		resolve => {
			getConditions(patient).then(
				conditions => {
					let validConds = conditions.filter(isValidCondition)
					let activeConds = validConds.filter(isActiveCondition)
					resolve(
						conditions.filter(isActiveCondition).filter(isValidCondition)
					)
				}
			)
		}
	)
}


