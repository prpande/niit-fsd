const names = ['james', 'alan', 'sophia', 'lawerence', 'andrew',
    'alexander', 'ruby', 'ariana', 'bruce', 'charlie', 'andrea'];

let upperCaseNames = names.map(name => name.toUpperCase());
console.log("Changing names to capital letters");
console.log(upperCaseNames);

let filterNames = names.filter(name => name.startsWith('a'));
console.log("Names starting with 'A'");
console.log(filterNames);

let counter = 0;
let nameCount = names.reduce((counter, name) => {
    counter += name.startsWith('a') ? 1 : 0;
    return counter;
}, counter);
console.log(`Count of names starting with 'a':${nameCount}`);

//Function Chaining
let count = 0;
let countOfNames = names
    .map(name => name.toUpperCase())
    .filter(name => name.startsWith('A'))
    .reduce((count, name) => {
        return ++count;
    }, count);

console.log(`Count of names starting with 'a':${countOfNames}`);
