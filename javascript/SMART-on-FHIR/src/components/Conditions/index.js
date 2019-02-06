import React from 'react'
import '../../../node_modules/react-table/react-table.css'
import './style.scss'

import ReactTable from 'react-table'
import Loading from '../Loading'

import { FamilyConsumer } from '../../contexts/Family'

class Conditions extends React.Component {
  render() {
    const columns = [
      {
        Header: 'Condition Name',
        accessor: 'name',
      },
      {
        Header: 'Date First Recorded',
        accessor: 'dateFirstRecorded',
      },
      {
        Header: 'Details',
        accessor: 'link',
        Cell: props => <a href={props.value}>Details on PubMed</a>,
      },
    ]

    return (
      <FamilyConsumer>
        {({ loadingConditions, conditions }) => {
          return (
            <div>
              {loadingConditions ? (
                <Loading />
              ) : (
                <ReactTable data={conditions} columns={columns} />
              )}
            </div>
          )
        }}
      </FamilyConsumer>
    )
  }
}

export default Conditions
