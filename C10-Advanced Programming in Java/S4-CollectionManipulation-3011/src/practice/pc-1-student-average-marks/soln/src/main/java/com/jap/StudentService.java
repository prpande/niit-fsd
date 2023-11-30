package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){
        //create six student object by calling Student class parameterized constructor
        Student s1= new Student("Ram",12,478);
        Student s2= new Student("Shyam",3,520);
        Student s3= new Student("Ajay",33,480);
        Student s4= new Student("Atul",17,501);
        Student s5= new Student("Mohan",25,434);
        Student s6= new Student("Rohan",42,390);

        //create HashSet object and add all the students object inside it
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        studentSet.add(s5);
        studentSet.add(s6);

        //return the HashSet object
        return studentSet;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet) {
        //Create a TreeSet object
        TreeSet<String> sortedSet = new TreeSet<>();

        //Use Iterator object of type <Student> to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();

        while (iterator.hasNext()) {
            //get all the name and add it inside the TreeSet object
            sortedSet.add(iterator.next().getName());
        }

        //return the TreeSet object;
        return sortedSet;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet) {
        //create a HashMap object of type <String,Integer>
        HashMap<String, Integer> avgHashMap = new HashMap<>();
        int avgMarks = 0;
        //Use Iterator object of type <Student>to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();

        while (iterator.hasNext()) {
            //retrieve the Student object from the iterator
            //Use getter method to get TotalMarks of each student. calculate the average
            avgMarks += iterator.next().getTotalMarks();
        }

        avgMarks /= studentSet.size();

        //add the student name and average marks in the HashMap object created in the
        //first line and return the map
        iterator = studentSet.iterator();
        while (iterator.hasNext()) {
            avgHashMap.put(iterator.next().getName(), avgMarks);
        }
        return avgHashMap;

    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }


}
