const students = [
    {
        studentName: 'John',
        gender: 'Male'
    },
    {
        studentName: 'Amelia',
        gender: 'Female'
    },
    {
        studentName: 'James',
        gender: 'Male'
    },
    {
        studentName: 'William',
        gender: 'Male'
    },
    {
        studentName: 'Sophia',
        gender: 'Female'
    },
    {
        studentName: 'Emma',
        gender: 'Female'
    },
    {
        studentName: 'Robert',
        gender: 'Male'
    }
]

//student stock based on gender
const studentStock = students.reduce((stocks, student) => {
    //returns -1 for each new gender type since the gender is not pushed to stocks array yet
    let genderIndex = stocks.map(s => s.gender).indexOf(student.gender);
    if (genderIndex >= 0) {
        stocks[genderIndex].stock += 1;
    }
    else
        stocks.push({
            "gender": student.gender,
            "stock": 1
        });
    return stocks;
}, [])

console.log(studentStock);