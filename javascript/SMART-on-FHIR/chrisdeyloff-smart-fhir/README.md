## Design Notes

I used various existing libraries, such as, react-table, axios, moment and capitalize. The organization of code files is simplistic and would need to be better organized for a real-world app. `API.js` is a simple abstracted UI api service. Axios and async/await are used to streamline http requests. Error handling and displaying is very simplistic as well and would need to be built out for a real-world app. Unit tests would need to written. FHIR documentation wasn't clear as to what value from the condition JSON should be used when navigating to PubMed.

## Project Notes

This project was created using [Create React App].

## Available Scripts

In the project directory, you can run:

### `npm start`

Runs the app in the development mode.<br>
Open [http://localhost:3001](http://localhost:3001) to view it in the browser.

The page will reload if you make edits.<br>
You will also see any lint errors in the console.
