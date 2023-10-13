const countrySelect = document.getElementById("countrySelect");
const countryDetails = document.getElementById("countryDetails");
let countryData; // Declare the variable to hold the fetched country data

// Fetch country data from the API
fetch("https://restcountries.com/v3.1/all")
  .then((response) => response.json())
  .then((data) => {
    countryData = data; // Store the fetched data in the variable
    data.forEach((country) => {
      const option = document.createElement("option");
      option.value = country.cca3;
      option.textContent = country.name.common;
      countrySelect.appendChild(option);
    });
  })
  .catch((error) => {
    console.error("Error fetching country data:", error);
  });

// Add event listener to the select element
countrySelect.addEventListener("change", () => {
  const selectedCountryCode = countrySelect.value;
  const selectedCountry = countryData.find((country) => country.cca3 === selectedCountryCode);

  if (selectedCountry) {
    const countryInfo = `
      <h2>${selectedCountry.name.common}</h2>
      <p><strong>Capital:</strong> ${selectedCountry.capital}</p>
      <p><strong>Population:</strong> ${selectedCountry.population}</p>
      <p><strong>Languages:</strong> ${Object.values(selectedCountry.languages).join(", ")}</p>
    `;

    countryDetails.innerHTML = countryInfo;
  } else {
    countryDetails.innerHTML = "";
  }
});
