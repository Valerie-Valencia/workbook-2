package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Full Name Parser... \n" +
                "Using one of the two following formats \n" +
                "(first last " + "or" + " first middle last) \n" +
                "Please enter your name: ");

        String userInput = scanner.nextLine();
        String fullName[] = userInput.split("\\ ");

        if(fullName.length == 2){
            String firstName = fullName[0].replaceFirst(fullName[0].substring(0,1),
                    fullName[0].substring(0,1).toUpperCase());
            String lastName = fullName[1].replaceFirst(fullName[1].substring(0,1),
                    fullName[1].substring(0,1).toUpperCase());
            System.out.println("First name: " + firstName + "\n" +
                    "Middle name: (none)\n" + "Last name: " + lastName);
        }
        if(fullName.length == 3){
            String firstName = fullName[0].replaceFirst(fullName[0].substring(0,1),
                    fullName[0].substring(0,1).toUpperCase());
            String middleName = fullName[1].replaceFirst(fullName[1].substring(0,1),
                    fullName[1].substring(0,1).toUpperCase());
            String lastName = fullName[2].replaceFirst(fullName[2].substring(0,1),
                    fullName[2].substring(0,1).toUpperCase());
            if(middleName.length() == 1){
                System.out.println("First name: " + firstName + "\n" +
                        "Middle name: " + middleName + "." + "\n" + "Last name: " + lastName);
            }
            if(middleName.length() > 1){
                System.out.println("First name: " + firstName + "\n" +
                        "Middle name: " + middleName + "\n" + "Last name: " + lastName);
            }
        }

    }
}
