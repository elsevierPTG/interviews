export const config = {
  apiBase:
    'https://fhir-open.sandboxcerner.com/dstu2/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca',
  person: {
    id: 4342010,

    // I would normally get these from an API call to `/Patient`, but am assuming we've stored it already for the sake of scope :)
    identifier:
      'urn:oid:2.16.840.1.113883.3.13.6|URN:CERNER:IDENTITY-FEDERATION:REALM:687F29DD-69DD-4DE5-ACB1-FD8A2241EF3A:PRINCIPAL:UY4572B79XK',
  },
  conditionSearchBase: 'https://www.ncbi.nlm.nih.gov/pubmed/?term=',
}
