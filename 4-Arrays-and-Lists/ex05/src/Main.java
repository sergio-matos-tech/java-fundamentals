import entities.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("How many people would you like to insert? ");
        int n = input.nextInt();

        Person[] people = new Person[n];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();
            input.nextLine();
            System.out.printf("\nData from the %dº person: \n", i + 1);
            System.out.print("Name: ");
            people[i].setName(input.nextLine());

            System.out.print("Age: ");
            people[i].setAge(input.nextInt());

            System.out.print("Height: (cm) ");
            people[i].setHeight(input.nextFloat());

        }

        double sumOfHeights = 0;
        int amountOfPeopleLess16 = 0;
        ArrayList<Person> peopleLess16 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sumOfHeights += people[i].getHeight();
            if (people[i].getAge() < 16) {
                amountOfPeopleLess16 += 1;
                peopleLess16.add((people[i]));
            }
        }

        System.out.printf("\nAverage Height: %.2f \n", sumOfHeights / n);
        System.out.println("People with age less than 16: \n" + peopleLess16);
        System.out.printf("Percentage of them: %.1f%%", ((float) amountOfPeopleLess16 / (float) n) * 100);

        input.close();
    }
}