import React from 'react';

import './Spinner.css';
import { ReactComponent as Rings } from './images/rings.svg';

export default function Spinner({ children }) {
  return (
    <div className="Spinner">
      <Rings />
      {children || 'Please wait'}...
    </div>
  );
}