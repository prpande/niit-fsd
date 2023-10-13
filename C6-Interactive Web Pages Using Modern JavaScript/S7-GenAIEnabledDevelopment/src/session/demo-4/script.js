const apiUrl = 'https://restcountries.com/v3.1/all';
const countriesPerPage = 10;
let currentPage = 1;
let countriesData = [];

const fetchCountries = () => {
    axios.get(apiUrl)
        .then(response => {
            countriesData = response.data;
            countriesData.sort((c1, c2)=>c1.name.common>c2.name.common ? 1 : -1)
            displayCountries();
        })
        .catch(error => {
            console.error('Error fetching data:', error);
        });
};

const filterCountries = (searchText) => {
    const filteredCountries = countriesData.filter(country => {
        const commonName = country.name.common.toLowerCase();
        return commonName.includes(searchText.toLowerCase());
    });

    return filteredCountries;
};

const displayCountries = (filteredCountries) => {
    const countriesContainer = document.querySelector('.cards');
    countriesContainer.innerHTML = '';

    const countriesToDisplay = filteredCountries || countriesData;

    const startIndex = (currentPage - 1) * countriesPerPage;
    const endIndex = startIndex + countriesPerPage;

    for (let i = startIndex; i < endIndex && i < countriesToDisplay.length; i++) {
        const country = countriesToDisplay[i];
        const card = document.createElement('div');
        card.classList.add('col-md-4', 'mb-4');
        const currencyInfo = country.currencies
                            ? 
                            country.currencies[Object.keys(country.currencies)]
                            ?                       
                            `${Object.keys(country.currencies)} (${country.currencies[Object.keys(country.currencies)].symbol})`
                            :
                            `${Object.keys(country.currencies)}` 
                            : 
                            'N/A';
        
        card.innerHTML = `
            <div class="card">
                <img src="${country.flags.svg}" class="card-img-top" alt="${country.name.common} Flag">
                <div class="card-body">
                    <h5 class="card-title">${country.name.common}</h5>
                    <p class="card-text">Official Name: ${country.name.official}</p>
                    <p class="card-text">Region: ${country.region}</p>
                    <p class="card-text">Capital: ${country.capital}</p>
                    <p class="card-text">Currency: ${currencyInfo}</p>
                </div>
            </div>
        `;
        countriesContainer.appendChild(card);
    }

    const paginationContainer = document.querySelector('.pagination');
    paginationContainer.innerHTML = '';
    const totalPages = Math.ceil(countriesToDisplay.length / countriesPerPage);
    for (let i = 1; i <= totalPages; i++) {
        const pageLink = document.createElement('li');
        pageLink.classList.add('page-item');
        if (i === currentPage) {
            pageLink.classList.add('active');
        }
        pageLink.innerHTML = `<a class="page-link" href="#" onclick="handlePageClick(${i})">${i}</a>`;
        paginationContainer.appendChild(pageLink);
    }
};

const handleSearch = () => {
    const searchInput = document.getElementById('searchInput');
    const searchText = searchInput.value;

    const filteredCountries = filterCountries(searchText);
    displayCountries(filteredCountries);
};

const handlePageClick = (page) => {
    currentPage = page;
    displayCountries();
};

fetchCountries();
