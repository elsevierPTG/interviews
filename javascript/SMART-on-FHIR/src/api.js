import { config } from './config'
import axios from 'axios'

export const api = axios.create({
  baseURL: config.apiBase,
  timeout: 20000,
  headers: { Accept: 'application/json+fhir' },
})

// Trying to work around a strange edge case where the API response sometimes
// returns an empty set of results.
//
// This is an axios interceptor that will detect that response and try again until
// receiving a set of results
api.interceptors.response.use(response => {
  if (response.data.total <= 0) {
    return api.request(response.config)
  }
  return response
})

export const fetchFamily = () => {
  return (
    api
      .get('/RelatedPerson', {
        params: {
          identifier: config.person.identifier,
        },
      })
      .then(response => response.data)
      // TODO: Add error state
      .catch(error => console.error(error))
  )
}

export const fetchConditions = id => {
  return (
    api
      .get('/Condition', {
        params: {
          patient: id,
        },
      })
      .then(response => response.data)
      // TODO: Add error state
      .catch(error => console.error(error))
  )
}
