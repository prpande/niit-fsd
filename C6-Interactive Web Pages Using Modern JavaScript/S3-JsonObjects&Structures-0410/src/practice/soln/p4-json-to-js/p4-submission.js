/*
Practice 4 - Parse JSON to Perform Aggregations
*/

// Declare and initialize variable to store the `flights` data.
// Copy flights data from `p3-submission.json` file created in Practice 3.

const flights = `{
    "flights": [
        {
            "from": "Chicago",
            "to": "New York",
            "flightOptions": [
                {
                    "departureDays": "M-Tu-W-Th-F",
                    "flightNo": "DL551",
                    "airlines": "Delta Airlines",
                    "departureTime": "06:00:00",
                    "arrivalTime": "09:13:00",
                    "stopOvers": null,
                    "isDirect": true,
                    "departureFrom": "ORD",
                    "arrivalAt": "LGA"
                },
                {
                    "departureDays": "M-T-W-Th",
                    "flightNo": "UA2202",
                    "airlines": "United Airlines",
                    "departureTime": "19:46:00",
                    "arrivalTime": "22:56:00",
                    "stopOvers": null,
                    "isDirect": true,
                    "departureFrom": "ORD",
                    "arrivalAt": "EWR"
                },
                {
                    "departureDays": "T-W-T",
                    "flightNo": "UA265",
                    "airlines": "United Airlines",
                    "departureTime": "18:00:00",
                    "arrivalTime": "21:15:00",
                    "stopOvers": null,
                    "isDirect": true,
                    "departureFrom": "ORD",
                    "arrivalAt": "LGA"
                },
                {
                    "departureDays": "Th",
                    "flightNo": "AA1378",
                    "airlines": "American Airlines",
                    "departureTime": "11:21:00",
                    "arrivalTime": "14:30:00",
                    "stopOvers": null,
                    "isDirect": true,
                    "departureFrom": "ORD",
                    "arrivalAt": "JFK"
                },
                {
                    "departureDays": "M-Tu-W-Th-F",
                    "flightNo": "DL556",
                    "airlines": "Delta Airlines",
                    "departureTime": "08:45:00",
                    "arrivalTime": "11:59:00",
                    "stopOvers": null,
                    "isDirect": true,
                    "departureFrom": "ORD",
                    "arrivalAt": "LGA"
                },
                {
                    "departureDays": "Tu",
                    "flightNo": "AA552",
                    "airlines": "American Airlines",
                    "departureTime": "18:23:00",
                    "arrivalTime": "21:32:00",
                    "stopOvers": null,
                    "isDirect": true,
                    "departureFrom": "ORD",
                    "arrivalAt": "EWR"
                }
            ]
        }
    ]
}`;

// Convert JSON to JavaScript object

const flightObject = JSON.parse(flights);

// Define function `searchFlights()` to filter and fetch flight details of flights flying from Chicago to New York by United Airlines.
// parameters will have to be added by the learner
function searchFlights(flightsData, source, destination, airlines) {
    return flightsData.flights
        .filter((data) => {
            return data.from === source && data.to === destination;
        }).map(data => {
            data.flightOptions = data.flightOptions.filter(option => option.airlines == airlines)
            return data;
        });
}

// do not delete below code, it is written to make searchFlights() function exportable for testing purpose
module.exports = {
    searchFlights,
};

// console.log(searchFlights(flightObject, "Chicago", "New York", "American Airlines"));