package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Full Name Generator ...");

        String firstName = getStringInput(scanner,"Enter your first name: ").trim();
        String middleName = getStringInput(scanner, "Enter your middle name or initial, if any: ").trim();
        String lastName = getStringInput(scanner, "Enter your last name: ").trim();
        String suffix = getStringInput(scanner, "Enter your suffix, if any: ").trim();

        firstName = firstName.replaceFirst(firstName.substring(0,1), firstName.substring(0,1).toUpperCase());
        lastName = lastName.replace(lastName.substring(0,1), lastName.substring(0,1).toUpperCase());

        if (middleName.length()
                == 1){
            middleName = middleName.toUpperCase() + ".";
        }

        if (!suffix.isBlank()){
            suffix = ", " + suffix.toUpperCase();
        }

        System.out.println(firstName + " " + middleName + " " + lastName + suffix);

    }

    public static String getStringInput(Scanner scanner, String prompt){

        System.out.print(prompt);
        String input = scanner.nextLine().trim();
       return input;
    }
}
