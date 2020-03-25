import React from 'react'
import { FaChevronCircleDown } from 'react-icons/fa'
import { Row, Col } from 'react-grid-system'

function Patient(props) {
    const name = props.name
    const resource = props.resource
    return (
        <Row>
            <Col lg={4} xl={4}>
                <div className='name'>
                    <h3>{ name.given[0] }</h3>
                    <h3>{ name.family }</h3>
                </div>
            </Col>
            <Col className='gender' lg={2} xl={2}>
                <p>{ resource.gender }</p>
            </Col>
            <Col className='dob' lg={3} xl={3}>
                <h4>Birth Date:</h4>
                <p>{ resource.birthDate }</p>
            </Col>
            <Col lg={3} xl={3}>
                <div className='display' onClick={ () => props.handleClick() }>
                    <h6>DISPLAY CONDITIONS</h6>
                    <FaChevronCircleDown />
                </div>
            </Col>
        </Row>
    )
}

export default Patient
