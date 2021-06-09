package ex01;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021  Ann Binus

Exercise 1 - Saying Hello
Create a program that prompts for your name and prints a greeting using your name.

Example Output
What is your name? Brian
Hello, Brian, nice to meet you!

Constraint
Keep the input, string concatenation, and output separate.

Challenges
Write a new version of the program without using any variables.
Write a version of the program that displays different greetings for different people.
Write a version of the program that displays the greeting in a GUI window.

 */

public class SayingHello {
    public static void main(String[] args) {
        SayingHello a = new SayingHello();

        String name = a.readName();
        String output = a.generateOutputString(name);
        a.printOutput(output);
    }

    public void printOutput(String output) {
        System.out.println(output);
    }

    public static String readName() {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scan.nextLine();
        return name;
    }

    public String generateOutputString(String name) {
        return ("Hello, " + name + ", nice to meet you!");
    }
}

