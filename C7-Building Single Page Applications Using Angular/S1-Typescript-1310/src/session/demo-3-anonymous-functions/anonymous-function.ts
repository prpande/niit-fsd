//No type annotation, but typescript can understand the type
const names = ["Alice", "Bob", "Eve"];
//contextual typing for Anonymous functions
names.forEach(function (s) {
    console.log(s.toUpperCase());
});

//contextal typing for Arrow Functions
names.forEach((s) => {
    console.log(s.toUpperCase());
});
