import React from 'react'
import './style.scss'

import { FamilyConsumer } from '../../contexts/Family'
import FamilyMember from '../FamilyMember'
import Loading from '../Loading'

const FamilyList = () => (
  <FamilyConsumer>
    {({ loadingFamily, members, selectedMember, onSelectMember }) => {
      return (
        <div>
          {loadingFamily ? (
            <Loading />
          ) : (
            <ul className="family-list">
              {members.map((member, index) => (
                <FamilyMember
                  key={index}
                  name={member.name}
                  relationship={member.relationship}
                  selected={index === selectedMember}
                  onClick={() => onSelectMember(member, index)}
                />
              ))}
            </ul>
          )}
        </div>
      )
    }}
  </FamilyConsumer>
)

export default FamilyList
