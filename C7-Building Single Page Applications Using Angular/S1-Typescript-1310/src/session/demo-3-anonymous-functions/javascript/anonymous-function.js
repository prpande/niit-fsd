//No type annotation, but typescript can understand the type
var names = ["Alice", "Bob", "Eve"];
//contextual typing for Anonymous functions
names.forEach(function (s) {
    console.log(s.toUpperCase());
});
//contextual typing for Arrow Functions
names.forEach(function (s) {
    console.log(s.toUpperCase());
});
