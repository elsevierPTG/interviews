var express = require('express');
var router = express.Router();
const axios = require("axios");

const baseFHIR_API = 'https://fhir-open.sandboxcerner.com/dstu2/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/';

/* GET patient info. */
router.get('/:id', async function(req, res, next) {
  try {
    const patientId = req.params.id;
    const url = `${baseFHIR_API}Patient/${patientId}`;
    console.log(url);
    const response = await axios.get(url);
    const data = response.data;
    console.log(data);
    res.json(data);
  } catch (error) {
    console.log(error);
  }
});

/* GET patient conditions. */
router.get('/condition/:id', async function(req, res, next) {
  try {
    const patientId = req.params.id;
    const url = `${baseFHIR_API}Condition?patient=${patientId}`;
    console.log(url);
    const response = await axios.get(url);
    const data = response.data;
    console.log(data);
    res.json(data);
  } catch (error) {
    console.log(error);
  }
});

module.exports = router;
