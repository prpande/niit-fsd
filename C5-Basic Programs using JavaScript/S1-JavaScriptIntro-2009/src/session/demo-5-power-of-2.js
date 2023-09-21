let n = 0;
let e;
do {
    e = 2 ** n++;
    console.log(e);
} while (e < 1024);