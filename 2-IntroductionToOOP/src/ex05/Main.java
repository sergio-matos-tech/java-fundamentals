package ex05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nName of the student: ");
        String name1 = input.nextLine();
        System.out.print("ID of the student: (8 digit)");
        String ID1 = input.nextLine();
        System.out.print("Grade of the first semester (0-100): ");
        double gradeFirstSemester1 = input.nextDouble();
        System.out.print("Grade of the second semester (0-100): ");
        double gradeSecondSemester1 = input.nextDouble();

        Student student01 = new Student(name1, ID1, gradeFirstSemester1, gradeSecondSemester1);
        System.out.println("Final grade: " + student01.finalGrade());
        if (student01.finalGrade() >= 60) {
            System.out.println("** PASS **");
        } else {
            System.out.println("** FAILED **");
            System.out.printf("Missing %.2f points", 60 - student01.finalGrade());
        }
    }
}
