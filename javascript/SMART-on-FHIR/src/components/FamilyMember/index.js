import React from 'react'
import PropTypes from 'prop-types'
import './style.scss'

import { BaseButton } from '../Button'
import Heading from '../Heading'

const FamilyMember = ({ name, relationship, selected, onClick }) => {
  return (
    <li className="family-list__item">
      <Heading type="tertiary" element="h3">
        {relationship}
      </Heading>
      <BaseButton
        className="family-member"
        onClick={onClick}
        selected={selected}
      >
        {name}
      </BaseButton>
    </li>
  )
}

FamilyMember.propTypes = {
  name: PropTypes.string.isRequired,
  relationship: PropTypes.string.isRequired,
  selected: PropTypes.bool.isRequired,
  onClick: PropTypes.func.isRequired,
}

export default FamilyMember
