const axios = require("axios");
const API_URL =  'http://localhost:3000/Patient/';

// Get Patient Info
export async function getPatientInfo(patientId) {
    try {
        const url = `${API_URL}${patientId}`;
        const response = await axios.get(url);
        const data = response.data;
        return data;
      } catch (error) {
        console.log(error);
      }
    
    // return rp({
    //   ...API_OPTIONS,
    //   url: `${API_ADDRESS}/Patient/${patientID}`
    // })
    // .catch((rpError) => {
    //   // Rethrow an interpreted error
    //   throw interpretError(rpError)
    // })
}

// Get Patient Conditions
export async function getPatientConditions(patientId) {
    try {
        const url = `${API_URL}condition/${patientId}`;
        const response = await axios.get(url);
        const data = response.data;
        return data;
      } catch (error) {
        console.log(error);
      }
//   return rp({
//       ...API_OPTIONS,
//       url: `${API_ADDRESS}/Condition?patient=${patientID}`
//     })
//     .catch((rpError) => {
//       // Rethrow an interpreted error
//       throw interpretError(rpError)
//     })
}