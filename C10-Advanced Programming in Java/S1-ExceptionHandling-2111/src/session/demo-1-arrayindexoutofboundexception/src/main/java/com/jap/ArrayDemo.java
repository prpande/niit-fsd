package com.jap;

public class ArrayDemo {



    public static void displayArrayWithHardCodedArraySize(){
        int age[] = {23,34,33,45,25,56,65,45,32};

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(age[i]);
            }
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exception Caught " +exception);
        }
    }
    public static void displayArrayWithLengthProperty(){
        int age[] = {23,34,33,45,25,56,65,45,32};

        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
    }


    public static void main(String[] args) {
        ArrayDemo.displayArrayWithHardCodedArraySize();
        System.out.println("--------------------------");
        ArrayDemo.displayArrayWithLengthProperty();
    }
}
