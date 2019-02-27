
import React from 'react';

export default function Error({ children }) {
  return (
    <div>
    <div>An error has occurred:</div>
    <div>{children}</div>
    </div>
  );
}