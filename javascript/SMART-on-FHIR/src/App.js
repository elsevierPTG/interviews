import React, { Component } from 'react'
import Patient from './components/Patient'
import { Container, Row, Col } from 'react-grid-system'
import axios from 'axios'
import './App.scss'

export default class App extends Component {

    constructor(props) {
        super(props);
        this.state = {
            patients: null,
            conditions: null,
        }
    }

    componentDidMount() {
        this.get_patients()
    }

    get_patients = () => {
        axios.get(`https://r4.smarthealthit.org/Patient`)
        .then(response => {
            this.setState({ patients: response })
            this.show_patients()
        })
    }

    get_conditions = (id) => {
        axios.get(`https://r4.smarthealthit.org/Condition/_search?subject%3APatient=${id}`)
        .then(response => {
            this.setState({ conditions: response })
        })
    }

    show_patients = () => {
        console.log('boom', this.state.patients)
    }

    sort_by_name = () => {
        let conditions = this.state.conditions
        conditions.data.entry = conditions.data.entry.sort((a, b) => (a.resource.code.text > b.resource.code.text) ? 1 : -1)
        this.setState({ conditions: conditions })
    }

    sort_by_date = () => {
        let conditions = this.state.conditions
        conditions.data.entry = conditions.data.entry.sort(function(a, b) {
            const keyA = new Date(a.resource.onsetDateTime)
            const keyB = new Date(b.resource.onsetDateTime)
            if (keyA < keyB) return -1
            if (keyA > keyB) return 1
            return 0
        })
        this.setState({ conditions: conditions })
    }

    return_conditions = () => {
        const conditions = this.state.conditions
        if (conditions) {
            return (
                <div className='conditions'>
                    <Container>
                        <Row>
                            <div className='sort'>
                                <Col lg={12} xl={12} md={12}>
                                    <h5>SORT BY:</h5>
                                    <span className='btn' onClick={ () => this.sort_by_name() }><h6>NAME (A - Z)</h6></span>
                                    <span className='btn' onClick={ () => this.sort_by_date() }><h6>ONSET (ASC)</h6></span>
                                </Col>
                            </div>
                        </Row>
                        <Row>
                            <Col lg={12} xl={12} md={12}>
                                {conditions.data.entry.map((condition, index) => {
                                    const resource = condition.resource
                                    const name = resource.code.text
                                    const dateTime = new Date(resource.onsetDateTime)
                                    return (
                                        <div className='condition' key={ index }>
                                            <Row>
                                                <Col lg={6} xl={6} md={6}>
                                                    <h3>{ name }</h3>
                                                </Col>
                                                <Col lg={3} xl={3} md={3}>
                                                    <a
                                                        href={`https://www.ncbi.nlm.nih.gov/pubmed/?term=${name}`}
                                                        target="_blank"
                                                        rel="noopener noreferrer"
                                                    >
                                                        <div className='search-btn'>
                                                            <h5>SEARCH ON PUBMED</h5>
                                                        </div>
                                                    </a>
                                                </Col>
                                            </Row>
                                            <Row>
                                                <div className='onset'>
                                                    <Col lg={12} xl={12} md={12}>
                                                        <h6>Onset Date/Time: </h6>
                                                        <p>{ dateTime.toString() }</p>
                                                    </Col>
                                                </div>
                                            </Row>
                                        </div>
                                    )
                                })}
                            </Col>
                        </Row>
                    </Container>
                </div>
            )
        }
    }

    select = (id) => {
        let patients = this.state.patients
        const promise = new Promise((resolve, reject) => {
            patients.data.entry.forEach((patient, index) => {
                if (id === patient.resource.id) {
                    if (patient.selected) {
                        patient.selected = !patient.selected
                    } else {
                        patient.selected = true
                    }
                } else {
                    patient.selected = false
                }
            })
            resolve('select promise complete')
        })
        promise.then((message) => {
            this.setState({ patients: patients })
        })
    }

    return_patients = () => {
        let patients = this.state.patients.data.entry
        return (
            patients.map((patient, index) => {
                const resource = patient.resource
                const name = resource.name[0]
                const id = patient.resource.id
                return (
                    <div className='patient' key={ index }>
                        <Patient
                            handleClick={ () => {
                                this.get_conditions(id)
                                this.select(id)
                            }}
                            name={ name }
                            resource={ resource }
                        />
                        {patient.selected &&
                            <div>
                                { this.return_conditions() }
                            </div>
                        }
                    </div>
                )
            })
        )
    }

    load_page = (url) => {
        axios.get(url)
        .then(response => {
            this.setState({ patients: response, conditions: null })
        })
    }

    return_pagination = () => {
        const links = this.state.patients.data.link
        let { nextUrl, previousUrl } = ''
        links.forEach(link => {
            if (link.relation === "next") {
                nextUrl = link.url
            } else if (link.relation === "previous") {
                previousUrl = link.url
            }
        })
        return (
            <div className='pagination'>
                {(previousUrl !== undefined) &&
                    <button onClick={ () => this.load_page(previousUrl) }><h4>PREVIOUS</h4></button>
                }
                {(nextUrl !== undefined) &&
                    <button onClick={ () => this.load_page(nextUrl) }><h4>NEXT</h4></button>
                }
            </div>
        )
    }

    render() {
        if (this.state.patients) {
            return (
                <div className="App">
                    <div className='header'>
                        <Container>
                            <h1>Patient Records</h1>
                            { this.return_pagination() }
                        </Container>
                    </div>
                    <Container>
                        <Row>
                            <Col sm={12} md={12} lg={12} xl={12}>
                                { this.return_patients() }
                            </Col>
                        </Row>
                    </Container>
                </div>
            )
        } else {
           return <div />
        }
    }
}
