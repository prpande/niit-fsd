var Student = /** @class */ (function () {
    function Student(studentID, name, marks) {
        this.name = name;
        this.studentID = studentID;
        this.marks = marks;
    }
    Student.prototype.getMarks = function () {
        return this.marks;
    };
    return Student;
}());
var student1 = new Student(11, "Rose Catherine", 87);
var student2 = new Student(12, "John Britto", 75);
var student3 = new Student(13, "Emy Jackson", 93);
//Change the student's name property​
student1.name = "Roselin Catherine";
//Prints Student Name: Roselin Catherine, Marks: 87​
console.log("Student Name: ".concat(student1.name, ", Marks: ").concat(student1.getMarks()));
//Prints Student Name: John Britto, Marks: 75​
console.log("Student Name: ".concat(student2.name, ", Marks: ").concat(student2.getMarks()));
//Prints Student Name: Emy Jackson, Marks: 93​
console.log("Student Name: ".concat(student3.name, ", Marks: ").concat(student3.getMarks()));
