const addr = 'https://fhir-open.sandboxcerner.com/dstu2/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/Condition?patient';

async function getPatientConditionData(patientId) {
  try {
    const response = await fetch(
        `${addr}=${patientId}`, {headers: {'accept': 'application/json'}});
    const data = await response.json();

    return { 
      data: data.entry,
      error: null
    };
  } catch (e) {
    return { error: e };
  }
}

export default {getPatientConditionData}