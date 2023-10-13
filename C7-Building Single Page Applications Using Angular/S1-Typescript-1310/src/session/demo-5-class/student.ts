class Student {
    studentID: number;
    name:string;
    marks: number;
    constructor(studentID: number, name: string, marks: number) {
        this.name = name;
        this.studentID = studentID;
        this.marks = marks;
    }
    getMarks(): number {
        return this.marks;
    }
}

const student1 = new Student(11, "Rose Catherine", 87);
const student2 = new Student(12, "John Britto", 75);
const student3 = new Student(13, "Emy Jackson", 93);

//Change the student's name property​
student1.name = "Roselin Catherine";
//Prints Student Name: Roselin Catherine, Marks: 87​
console.log(`Student Name: ${student1.name}, Marks: ${student1.getMarks()}`);
//Prints Student Name: John Britto, Marks: 75​
console.log(`Student Name: ${student2.name}, Marks: ${student2.getMarks()}`);
//Prints Student Name: Emy Jackson, Marks: 93​
console.log(`Student Name: ${student3.name}, Marks: ${student3.getMarks()}`);