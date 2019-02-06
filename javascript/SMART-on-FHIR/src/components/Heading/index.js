import React from 'react'
import PropTypes from 'prop-types'
import './style.scss'

const validTypes = ['title', 'secondary', 'tertiary']

const Heading = ({ children, element, type, ...props }) => {
  props.className = `heading heading--${type}`
  return React.createElement(element, props, children)
}

Heading.propTypes = {
  children: PropTypes.node.isRequired,
  element: PropTypes.string.isRequired,
  type: function(props, propName, componentName) {
    const regex = new RegExp(validTypes.join('|'))

    if (!regex.test(props[propName])) {
      return new Error(
        'Invalid prop `' +
          propName +
          '` supplied to' +
          ' `' +
          componentName +
          '`. Validation failed.'
      )
    }
  },
}

export default Heading
