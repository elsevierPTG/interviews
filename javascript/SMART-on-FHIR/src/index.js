import React from 'react'
import { render } from 'react-dom'
import { FamilyProvider } from './contexts/Family'

import App from './components/App'

const reactRoot = document.getElementById('react-root')

render(
  <FamilyProvider>
    <App />
  </FamilyProvider>,
  reactRoot
)
