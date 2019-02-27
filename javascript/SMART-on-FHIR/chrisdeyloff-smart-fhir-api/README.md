## Design Notes

I used various existing libraries, such as, express and axios. The code files are somewhat organized but could be improved for real-world app. Axios and async/await are used to streamline http requests to FHIR. Error handling is very simplistic as well and would need to be built out for a real-world app. Unit tests would need to written. Express CORS is initialized to allow the front-end to access the API.

## Project Notes

This project was created using [express-generator].

## Available Scripts

In the project directory, you can run:

### `npm start`

Runs the app in the development mode.<br>
The API will run on [http://localhost:3000](http://localhost:3000).
