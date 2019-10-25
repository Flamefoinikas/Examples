package examples;

import java.util.Scanner;

public class Examples {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        bestFriends();

    }

    static double planetWeight(String planet, double weight) {
        // ex 7
        planet = planet.toLowerCase();
        switch (planet) {
            case "venus":
                weight = weight * 0.78;
                break;

            case "mars":
                weight = weight * 0.39;
                break;

            case "jupiter":
                weight = weight * 2.65;
                break;

            case "saturn":
                weight = weight * 1.17;
                break;

            case "uranus":
                weight = weight * 1.05;
                break;

            case "neptune":
                weight = weight * 1.23;
                break;

        }

        return weight;

    }

    public static void findTheDay() {
        // Control Flow exercise 8

        System.out.println("Give me a Number");

        int numberOfDays = sc.nextInt();
        switch (numberOfDays % 7) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;

        }

    }

    public static void divBy3() {
        // some math 3
        System.out.println("Give me a number to check if it be divided by 3");
        int number = sc.nextInt();
        if (number % 3 == 0) {
            System.out.println("It can");
        } else {
            System.out.println("it can not");
        }

    }

    public static void findAge() {
        // some math 1
        System.out.println("Give me your Age");
        int age = sc.nextInt();

        int bornYear = 2019 - age;
        System.out.println(bornYear);
        int year1960 = 1960 - bornYear;
        int year2040 = 2019 + age;
        System.out.println((year1960 > 0) ? "You were " + year1960 + " years old" : "You were born after 1960");
        System.out.println("2040 " + year2040);

    }

    public static void salary() {
        // some math ex2 
        double salaryM = 900;
        double salaryY = (900 * 0.9) * 12;
        double salaryYG = (900 - 900 * 0.9) * 12;
        System.out.println("The amount of money that go in your pocker every year: " + salaryY + " What goverment takes: " + salaryYG);
    }

    public static void findTheClass() {
        // Control flow 1
        System.out.println("Give me your age");
        int age = sc.nextInt();
        if (age < 7) {
            System.out.println("πολυ μικρος για να πας Σχολειο");
        } else if (age < 13) {
            switch (age) {
                case 7:
                    System.out.println("A δημοτικου");
                    break;
                case 8:
                    System.out.println("B δημοτικου");
                    break;
                case 9:
                    System.out.println("Γ δημοτικου");
                    break;
                case 10:
                    System.out.println("Δ δημοτικου");
                    break;
                case 11:
                    System.out.println("Ε δημοτικου");
                    break;
                case 12:
                    System.out.println("ΣΤ δημοτικου");
                    break;
            }
        } else if (age < 16) {
            switch (age) {
                case 13:
                    System.out.println("A γυμνασιου");
                    break;
                case 14:
                    System.out.println("B γυμνασιου");
                    break;
                case 15:
                    System.out.println("Γ γυμνασιου");
                    break;
            }

        } else if (age < 19) {
            switch (age) {
                case 16:
                    System.out.println("A λυκειου");
                    break;
                case 17:
                    System.out.println("B λυκειου");
                    break;
                case 18:
                    System.out.println("Γ λυκειου");
                    break;
            }

        } else {
            System.out.println("Πολυ μεγαλος για να πας σχολειο");

        }
    }

    public static void everyDay() {
        // control flow 2
        System.out.println("write yes is its working day and no if its not");
        String workingDay = sc.next();

        switch (workingDay) {

            case "yes":

                System.out.println("Do a bath. Brush your teeth find clean clothes and get ready to go to work");

                break;

            case "no":

                System.out.println("Do whatever you like and stop asking a computer what to do.");

                break;

            default:

                System.out.println("i told you yes or no ");

        }

    }

    public static void whatSeason() {
        // control flow 3

        System.out.println("Write the month");

        String month = sc.next();

        switch (month) {

            case "january":
            case "february":
            case "december":

                System.out.println("Winter");

                break;

            case "march":
            case "april":
            case "may":

                System.out.println("Spring");
                break;

            case "june":
            case "july":
            case "august":

                System.out.println("Summer");
                break;

            case "september":
            case "october":
            case "november":

                System.out.println("Autumnma");
                break;

            default:

                System.out.println("Chinese calendar is not supported.");

        }
    }

    public static void numberOfDays() {
        // control flow 
        System.out.println("Give me the month");
        String month = sc.next().toLowerCase();
        switch (month) {

            case "january":
            case "december":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":

                System.out.println("31");

                break;

            case "april":
            case "june":
            case "september":
            case "november":

                System.out.println("30");
                break;
            case "february":
                System.out.println("28");
                break;

        }
    }

    public static void grade() {
        // ex 5
        System.out.println("What was your grade?");
        String grade = sc.next().toLowerCase();

        switch (grade) {
            case "a":
                System.out.println("Perfect");
                break;
            case "b":
                System.out.println("Good");
                break;
            case "c":
            case "d":
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
                break;
        }
    }

    public static void driveAge() {

        System.out.println("How old are you?");
        int age = sc.nextInt();
        age = Math.abs(age);
        if (age < 16) {
            System.out.println("You cannot drive");

        } else if (age < 17) {
            System.out.println("You can drive but not vote");

        } else if (age < 21) {
            System.out.println("You can vote but not drink");

        } else {
            System.out.println("You can do anything");

        }

    }

    public static void sumMinMax() {
        // loop ex 2

        int[] array = {3, 4, 5, 8, 1};
        int sum = 0;
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < 5; i++) {
            sum = sum + array[i];
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }

        }
        double avarage = (double) sum / 5;
        System.out.println("Sum =" + sum + " Min =" + min + " Max =" + max + " Avarage =" + avarage);
    }

    public static void bestFriends() {
        //loop 2 ex
        String[] array = new String[4];

        for (int i = 0; i < 4; i++) {
            array[i] = sc.next();
        }
        System.out.println("Your best friends are : " + array[0] + " " + array[1] + " " + array[2] + " " + array[3]);

    }

    public static void upperCase() {
        //upperCase ex
        System.out.println("Give me your first input");
        String a = sc.next();
        System.out.println("Now give me your second input");
        String b = sc.next();
        String upper = a.toUpperCase() + " " + b.toUpperCase();
        System.out.println(upper);

    }

}
