import Head from 'next/head';
import Patient from '../components/Patient';
import Conditions from '../components/Conditions';

const patientId = 1316024;
function IndexPage() {
    return (
        <div>
            <Head>
                <title>Elsevier</title>
                <meta name="viewport" content="initial-scale=1.0, width=device-width" />
            </Head>
            <header className="header">
                <div className="header_container">
                    <h1 className="header_title">Demo</h1>
                </div>
            </header>
            <main className="container">
                <div className="row">
                    <div className="aside">
                        <Patient patientId={patientId} />
                    </div>
                    <div className="main">
                        <Conditions patientId={patientId} />
                    </div>
                </div>
            </main>
            <style global jsx>{`
                body {
                    background-color: #fff;
                    padding: 0;
                    margin: 0;
                }

                ul {
                    margin: 0;
                    padding: 0;
                    list-style-type: none;
                }

                .header {
                    display: flex;
                    height: 64px;
                }

                .header_container {
                    display: flex;
                    width: 100%;
                    align-items: center;
                    box-shadow: 0px 6px 20px rgba(0, 0, 0, 0.06);
                    background-color: rgba(255, 255, 255, 0.98);
                    padding: 0 15px;
                }

                .header_title {
                    color: #0076ff;
                }

                .title {
                    margin: 0;
                    pagging: 0;
                }

                .container {
                    display: flex;
                    margin: 15px;
                }

                .row {
                    display: flex;
                    flex-direction: row;
                    flex-wrap: wrap;
                    width: 100%;
                }
                    
                .aside {
                    display: flex;
                    flex-direction: column;
                    flex: 1 0;
                    min-width: 300px;
                }

                .main {
                    display: flex;
                    flex-direction: column;
                    flex: 2 0;
                }

                .loading {
                    font-size: 16px;
                    color: #0076ff;
                    margin: 15px 0;
                }

            `}</style>
        </div>
    );
}

export default IndexPage;