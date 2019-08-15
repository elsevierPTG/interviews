import React, { Component } from 'react';
import './App.css';
import PatientsData from './containers/PatientsData.js';

class App extends Component {
  render() {
    return (
      <div className="App">
        <PatientsData />
      </div>
    );
  }
}

export default App;
