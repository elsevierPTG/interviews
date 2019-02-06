import React from 'react'
import PropTypes from 'prop-types'
import './style.scss'

const SubmitButton = ({ className, onClick, children }) => (
  <button className={`btn btn--submit ${className}`} onClick={onClick}>
    {children}
  </button>
)

const BaseButton = ({ className, onClick, selected, children }) => (
  <button
    className={`btn ${className} ${selected ? 'btn--selected' : ''}`}
    onClick={onClick}
  >
    {children}
  </button>
)

BaseButton.propTypes = {
  children: PropTypes.node.isRequired,
  className: PropTypes.string.isRequired,
  selected: PropTypes.bool.isRequired,
  onClick: PropTypes.func.isRequired,
}

SubmitButton.propTypes = {
  children: PropTypes.node.isRequired,
  className: PropTypes.string,
  onClick: PropTypes.func.isRequired,
}

export { BaseButton, SubmitButton }
