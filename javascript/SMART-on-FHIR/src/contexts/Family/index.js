import React from 'react'
import PropTypes from 'prop-types'
import { fetchFamily, fetchConditions } from '../../api'
import { config } from '../../config'

const { Provider, Consumer } = React.createContext()

class FamilyProvider extends React.Component {
  state = {
    members: [],
    conditions: [],
    selectedMember: null,
    error: null,
    loadingFamily: false,
    loadingConditions: false,
  }

  componentDidMount() {
    this.setState({ loadingFamily: true, error: null })

    fetchFamily()
      .then(response => {
        this.setState({
          loadingFamily: false,
          error: null,
          members: this.assembleFamily(response.entry),
        })
      })
      .catch(error => {
        this.setState({ loadingFamily: false, error })
      })
  }

  handleSelectMember = (member, index) => {
    const id = member.endpoint.split('/').pop()

    this.setState({
      loadingConditions: true,
      selectedMember: index,
    })

    fetchConditions(id)
      .then(response => {
        this.setState({
          loadingConditions: false,
          error: null,
          conditions: this.assembleConditions(response.entry),
        })
      })
      .catch(error => {
        this.setState({ loadingConditions: false, error })
      })
  }

  toTitleCase(str) {
    return str.replace(/\w\S*/g, function(txt) {
      return txt.charAt(0).toUpperCase() + txt.substr(1).toLowerCase()
    })
  }

  assembleFamily(records) {
    return records
      .map(record => {
        return {
          name: this.toTitleCase(record.resource.patient.display),
          endpoint: record.resource.patient.reference,
          relationship: this.toTitleCase(record.resource.relationship.text),
        }
      })
      .reduce((accumulator, current) => {
        // There can be multiple records for individuals in the response, so we
        // want to filter out any duplicates
        if (
          !accumulator.find(({ endpoint }) => endpoint === current.endpoint)
        ) {
          accumulator.push(current)
        }
        return accumulator
      }, [])
  }

  assembleConditions(records) {
    return records.map(record => {
      return {
        name: record.resource.code.text,
        // 2018-01-31
        dateFirstRecorded: record.resource.dateRecorded,
        link: `${config.conditionSearchBase}${record.resource.code.text}`,
      }
    })
  }

  render() {
    return (
      <Provider
        value={{
          ...this.state,
          onSelectMember: this.handleSelectMember,
        }}
      >
        {this.props.children}
      </Provider>
    )
  }
}

FamilyProvider.propTypes = {
  children: PropTypes.node.isRequired,
}

export { FamilyProvider, Consumer as FamilyConsumer }
