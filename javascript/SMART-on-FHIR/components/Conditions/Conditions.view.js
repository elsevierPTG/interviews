function ConditionsView({conditions, onSort, sort}) {
    return(
        <div className="conditions">
        <h4 className="conditions_label">Conditions Info</h4>
        <table className="conditions_table">
            <thead>
                <tr>
                    <th style={{'width': '70%'}} className={sort.field === 'text' ? 'active': ''} onClick={() => onSort('text')}>Condition</th>
                    <th style={{'width': '20%'}} className={sort.field === 'dateRecorded' ? 'active': ''} onClick={() => onSort('dateRecorded')}>Recorded date</th>
                    <th>Search</th>
                </tr>
            </thead>
            <tbody>
                {conditions.map((c, i) => (
                    <tr key={i}>
                        <td>{c.resource.code.text}</td>
                        <td>{c.resource.dateRecorded}</td>
                        <td><a href={`https://www.ncbi.nlm.nih.gov/pubmed/?term=${c.resource.code.text.trim()}`}>Link</a></td>
                    </tr>
                ))}
            </tbody>
        </table>
        <style jsx>{`
            .conditions {
                
            }
            .conditions_label {
                margin-bottom: 10px;
                color: #0076ff;
            }

            .conditions_table {
                width: 100%;
                max-width: 100%;
                border-collapse: collapse;
                border-spacing: 0;
            }

            .conditions_table > thead > tr > th.active {
                background-color: #0076ff85;
            }

            .conditions_table > thead > tr > th,
            .conditions_table > tbody > tr > td {
                vertical-align: bottom;
                padding: 8px;
                text-align: left;
                border: 1px solid #ddd;
                // white-space: nowrap;
            }

            .conditions_table > tbody > tr:nth-child(odd) > td {
                background-color: #0076ff2e;
            }

        `}</style>
        </div>
    )
}

export default ConditionsView;