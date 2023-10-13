type MyStudent = {
    studentId: number | string,
    firstName: string,
    lastName?: string,
    course: string,
    fees: number,
    availHostel: boolean
};
function printStudent(student: MyStudent) {
    if(student.lastName){
    console.log("Student ID:" + student.studentId + "\n" +
        "First Name:" + student.firstName + "\n" +
        "Last Name:" + student.lastName + "\n" +
        "Course:" + student.course + "\n" +
        "Fees:" + student.fees + "\n" +
        "Avail Hostel Facility:" + student.availHostel);
    }
    else{
        console.log("Student ID:" + student.studentId + "\n" +
        "First Name:" + student.firstName + "\n" +
        "Course:" + student.course + "\n" +
        "Fees:" + student.fees + "\n" +
        "Avail Hostel Facility:" + student.availHostel);
    }
}
let hostelStudent: MyStudent = {
    studentId: 101,
    firstName: "Allen",
    lastName: "Keth",
    course: "Java",
    fees: 200,
    availHostel: true
};
let student1: MyStudent = {
    studentId: "S102",
    firstName: "Joseph",
    course: "Angular",
    fees: 300,
    availHostel: false
}
printStudent(hostelStudent);
printStudent(student1);