package com.jap.marksevaluation;
public class OakBridgeSchool 
{

    // Convert the given string name to upper case
    public String convertToUpperCase(String name)
    {
        if(name == null || name.length() < 1)
        {
            return " ";
        }

       return name.toUpperCase();
    }

    // Find the shortest word in the list of surnames
    public String shortestSurname(String[] surnames)
    {
        if(surnames == null || surnames.length < 1)
        {
            return "Cannot find shortest word as array is empty";
        }

        String shortestString = surnames[0];
        for(String str : surnames)
        {
            if(str.length() < shortestString.length())
            {
                shortestString = str;
            }
        }

        return shortestString;
    }

    // Check if any of the names in the array is repeated, if yes return true else false
    public boolean checkIfNamesAreRepeated(String[] names)
    {
        boolean flag = false;
        int noOfStudents = names.length;
        for(int i = 0; i < noOfStudents; i++)
        {
            String nameToCheck = names[i];
            for(int j = i + 1; j < noOfStudents; j++)
            {
                if(nameToCheck.compareTo(names[j]) == 0)
                {
                    flag = true;
                }
            }
        }

        return flag;
    }

    // Concatenate the name and surname of the students
    public String[] concatenateNameAndSurname(String[] names, String [] surnames)
    {
        int noOfStudents = names.length;
        String []  concatenatedNames = new String[noOfStudents];
        for(int i = 0; i < noOfStudents; i++)
        {
            concatenatedNames[i] = names[i] + " " + surnames[i];
        }

        return  concatenatedNames;
    }

    // Display the names
    public void displayStudentNames(String[] namesArray)
    {
        
        for(String name : namesArray)
        {
            System.out.print(name + ", ");
        }

        System.out.println("");
    }

    public void sortStudentNames(String[] names)
    {
        int noOfStudents = names.length;
        for(int i = 1; i < noOfStudents; i++)
        {
            String key = names[i];
            int j = i - 1;
            while(j >= 0 && key.compareTo(names[j]) < 0)
            {
                names[j + 1] = names[j];
                j--;
            }
            
            names[j + 1] = key;
        }
    }

    public static void main(String[] args) 
    {
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();

        // Declare and Initialize values to the arrays
        String[] studentNames = new String[]{"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Kate", "Leo"};
        String[] studentSurnames = new String[]{"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Martin", "Clark", "King"};

        // Call the method to convert all the student names to upper case and display results
        System.out.println("The student names in uppercase :");
        for(String name : studentNames)
        {
            String upperCaseName = oakBridgeSchool.convertToUpperCase(name);
            System.out.print(upperCaseName + ", ");
        }
        System.out.println("");
        

        // Call the method to sort names in alphabetical order and display results
        oakBridgeSchool.sortStudentNames(studentNames);
        System.out.println("The student names in alphabetical order :");
        oakBridgeSchool.displayStudentNames(studentNames);

        // Call the method to find the shortest surname and display results
        String shortestSurname = oakBridgeSchool.shortestSurname(studentSurnames);
        System.out.println("The shortest surname is:" + shortestSurname);

        // Call the method to check if two names in the array are the same and display results
        boolean checkDuplicates = oakBridgeSchool.checkIfNamesAreRepeated(studentNames);
        System.out.println("There are repeated names in the name list : " + checkDuplicates);

        // Call the method to concatenate name and surname with a space in between and display results
        String[] fullNames = oakBridgeSchool.concatenateNameAndSurname(studentNames, studentSurnames);
        System.out.println("The student full names (name and surname) :");
        oakBridgeSchool.displayStudentNames(fullNames);
    }
}
