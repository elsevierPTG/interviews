import React from 'react'
import PropTypes from 'prop-types'
import './style.scss'

const Section = ({ children }) => (
  <section className="section container">{children}</section>
)

Section.propTypes = {
  children: PropTypes.node.isRequired,
}

export default Section
