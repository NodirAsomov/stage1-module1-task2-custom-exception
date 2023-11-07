package com.epam.mjc;


import java.util.Arrays;

public class StudentManager {

    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};


    public Student find(long studentID) {
        Student student= Student.getValueOf(studentID);

        if (student==null){
            throw new StudentNotFoundException(studentID);
        }
        else{
            return student;
        }
    }

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();


        for (int i = 0; i < IDs.length; i++) {

            Student student = manager.find(IDs[i]);
            try {


            }

             catch (StudentNotFoundException e) {
                 System.out.println( student.getName());
            }
        }
    }
}
