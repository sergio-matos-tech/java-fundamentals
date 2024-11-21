package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("How many students would you like to add? ");
        int amountOfStudents = input.nextInt();
        input.nextLine();

        Student[] students = new Student[amountOfStudents];

        for (int i = 0; i < amountOfStudents; i++) {
            System.out.printf("Enter the name, the ID, the first and the second grade of the %dº student: \n", i + 1);
            String name = input.nextLine();
            String ID = input.nextLine();
            float grade1 = input.nextFloat();
            float grade2 = input.nextFloat();
            students[i] = new Student(name, ID, grade1, grade2);
            input.nextLine();
        }

        System.out.println("\nApproved students: ");
        for (int i = 0; i < amountOfStudents; i++) {
            if (((students[i].getGradeFirstSemester() + students[i].getGradeSecondSemester()) / 2.0) > 6.0) {
                System.out.println(students[i]);
            }
        }

        input.close();
    }
}