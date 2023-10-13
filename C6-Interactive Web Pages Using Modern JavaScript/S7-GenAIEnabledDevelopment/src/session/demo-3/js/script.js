$(document).ready(function() {
  // Fetch country data from API
  $.get("https://restcountries.com/v3.1/all", function(data) {
      const countryList = data;

      // Populate country cards
      function populateCountryCards(countries) {
          $("#countryList").empty();
          countries.forEach(function(country) {
              const name = country.name.common;
              // const currency = Object.keys(country.currencies)[0]; //correction required
              const capital = country.capital;//correction required
              const flag = country.flags.svg;

              const card = `
                  <div class="col-md-4 mb-4">
                      <div class="card">
                          <img src="${flag}" class="card-img-top" alt="${name} Flag">
                          <div class="card-body">
                              <h5 class="card-title">${name}</h5>
                              <p class="card-text">
                                  <strong>Capital:</strong> ${capital}<br>
                                  <strong>Currency:</strong>  
                              </p>
                          </div>
                      </div>
                  </div>
              `;

              $("#countryList").append(card);
          });
      }

      populateCountryCards(countryList);

      // Search functionality
      $("#searchButton").click(function() {
          const searchValue = $("#searchInput").val().toLowerCase();
          const filteredCountries = countryList.filter(function(country) {
              return country.name.common.toLowerCase().includes(searchValue);
          });

          populateCountryCards(filteredCountries);
      });
  });
});
