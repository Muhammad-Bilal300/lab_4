/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_.a;

import java.util.Scanner;

/**
 *
 * @author computer clinic
 */
class course {

    public String course_name;
    private String students[];
    private int number_of_Students;

    course(String name, int students) {
        this.course_name = name;
        this.students = new String[students];
        number_of_Students = 0;
    }

    public void addStudents(String student) {
        students[number_of_Students] = student;
        number_of_Students++;
    }

    public String[] getStudents() {
        return students;

    }

    public int get_number_of_Students() {
        return number_of_Students;
    }

}

public class Lab4_A {

    public static void main(String[] args) {
//        Getting input from users

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total No of Students in Institute : ");

        int total_students = sc.nextInt();
//        
        course[] courseArray = new course[5];
        for (int i = 0; i < courseArray.length; i++) {

            System.out.print("Enter course Name : ");
            String course_name = sc.next();
            courseArray[i] = new course(course_name, total_students);
            courseArray[i].addStudents("Muhammad Bilal");
            courseArray[i].addStudents("Muzammil Saleem");
            courseArray[i].addStudents("Faiza");
            courseArray[i].addStudents("Muhammad Danish");

            System.out.println("There are " + courseArray[i].get_number_of_Students() + " stdents who are enrolled in " + courseArray[i].course_name + " course.");
            System.out.println("The names of these students are : ");
            for (int j = 0; j < courseArray[i].get_number_of_Students(); j++) {
                System.out.println((j + 1) + ") " + courseArray[i].getStudents()[j]);
            }
            System.out.println();
        }
//        course c1 = new course(course_name, total_students);

//        Adding students one by one in an array
//        for (int i = 0; i < total_students; i++) {
//            String student_name = sc.nextLine();
//            c1.addStudents(student_name);
//        }
//        c1.addStudents("Muhammad Bilal");
//        c1.addStudents("Muzammil Saleem");
//        c1.addStudents("Faiza");
//        c1.addStudents("Muhammad Danish");
//        System.out.println("There are " + c1.get_number_of_Students() + " stdents who are enrolled in " + c1.course_name + " course.");
//        System.out.println("The names of these students are : ");
//        for (int i = 0; i < c1.get_number_of_Students(); i++) {
//            System.out.println((i + 1) + ") " + c1.getStudents()[i]);
//        }
    }

}
