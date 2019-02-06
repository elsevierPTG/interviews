import React from 'react'
import 'sass/global.scss'
import './style.scss'

import Header from '../Header'
import Section from '../Section'
import Heading from '../Heading'
import FamilyList from '../FamilyList'
import Conditions from '../Conditions'

import { FamilyConsumer } from '../../contexts/Family'

export default class App extends React.Component {
  render() {
    return (
      <FamilyConsumer>
        {({ selectedMember, members, error }) => (
          <div className="app">
            <Header text="Smart Family Dashboard" />

            <Section>
              <Heading type="title" element="h2">
                Family Members
              </Heading>
              <FamilyList />
            </Section>

            {selectedMember !== null ? (
              <Section>
                <Heading type="title" element="h2">
                  {members[selectedMember].name.split(' ').pop()}&apos;s
                  Conditions
                </Heading>
                <Conditions />
              </Section>
            ) : (
              false
            )}
          </div>
        )}
      </FamilyConsumer>
    )
  }
}
