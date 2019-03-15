const addr = 'https://fhir-open.sandboxcerner.com/dstu2/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/Patient';

async function getPatientDemographicData(patientId) {
  try {
    const response = await fetch(`${addr}/${patientId}`, {headers: {'accept': 'application/json'}});
    const data = await response.json();

    const name = data.name.filter(d => d.use === 'official');

    return {
      data: {
        name: name[0] ? name[0].text : '',
        gender: data.gender,
        birthDate: data.birthDate
      },
      error: null
    };
  } catch(e) {
    return { error: e };
  }
}

export default {getPatientDemographicData}