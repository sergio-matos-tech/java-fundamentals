package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static final int AMOUNTOFPEOPLE = 5;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Person[] people = new Person[AMOUNTOFPEOPLE];

        for (int i = 0; i < AMOUNTOFPEOPLE; i++) {
            System.out.printf("\nEnter the NAME of the %d person: ", i + 1);
            String name = input.nextLine();
            System.out.printf("Enter the AGE of the %d person: ", i + 1);
            int age = input.nextInt();
            input.nextLine();
            System.out.printf("Enter the GENDER of the %d person: (F/M)", i + 1);
            char gender = input.nextLine().charAt(0);
            System.out.printf("Enter the HEIGHT of the %d person: ", i + 1);
            float height = input.nextFloat();
            people[i] = new Person(name, age, gender, height);

            input.nextLine();
        }


        int ageOfOlder = people[0].getAge();
        int indexOfOlderPerson = 0;
        float sumOfFEMHeights = 0;
        int amountOfMen = 0;

        float minHeight = people[0].getHeight();
        float maxHeight = people[0].getHeight();

        for (int i = 0; i < AMOUNTOFPEOPLE; i++) {
            if (people[i].getAge() > ageOfOlder) {
                ageOfOlder = people[i].getAge();
                indexOfOlderPerson = i;
            }
            if (people[i].getHeight() > maxHeight) {
                maxHeight = people[i].getHeight();
            } else if (people[i].getHeight() < minHeight) {
                minHeight = people[i].getHeight();
            }

            if (people[i].getGender() == 'F') {
                sumOfFEMHeights += people[i].getHeight();
            } else if (people[i].getGender() == 'M') {
                amountOfMen += 1;
            }


        }

        Person olderPerson = people[indexOfOlderPerson];
        System.out.println("\nOldest person: ");
        System.out.println(olderPerson);
        System.out.printf("Min height %.2f \n", minHeight);
        System.out.printf("Max height %.2f \n", maxHeight);
        System.out.printf("Average height of all women %.2f \n",
                sumOfFEMHeights / ((float) AMOUNTOFPEOPLE - amountOfMen));
        System.out.printf("Amount of men: %d\n", amountOfMen);

        input.close();
    }
}