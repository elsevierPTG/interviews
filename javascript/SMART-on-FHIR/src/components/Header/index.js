import React from 'react'
import PropTypes from 'prop-types'
import './style.scss'

const Header = () => (
  <header className="main-header">
    <nav className="main-header__nav container">
      <a href="/" className="main-header__link">
        <h1 className="main-header__title">Family Health Portal</h1>
      </a>
      <p className="main-header__sidebar">Welcome, Joe</p>
    </nav>
  </header>
)

Header.propTypes = {
  text: PropTypes.string.isRequired,
}

export default Header
