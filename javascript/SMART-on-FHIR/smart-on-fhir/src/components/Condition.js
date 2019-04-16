import React from "react";


const Condition = props => {
  let name = props.conditionName

  // I would have formatted the dates and done the link properly if I had
  // more time.
  return (
    <div className="Table">
      <table>
        <thead>
          <tr>
            <th>Condition Name</th>
            <th>Onset Date</th>
            <th>More Info</th>
          </tr>
        </thead>

        <tbody>
            <tr>
              <td>{name}</td>
              <td>{props.onset}</td>
              <a href='https://www.ncbi.nlm.nih.gov/pubmed/?term='>Here</a>
            </tr>
        </tbody>
      </table>
    </div>
  );
};

export default Condition;
