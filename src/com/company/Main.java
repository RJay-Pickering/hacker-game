package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        scramble code = new scramble();
        String coder = code.chooseAnswer();
        List<String> passwordBook = new ArrayList<String>();
        passwordBook.add("password");
        passwordBook.add("passhack");
        passwordBook.add("hackmans");
        passwordBook.add("gokachus");
        passwordBook.add("12345678");
        passwordBook.add("cyborg12");
        passwordBook.add("voodoovp");
        passwordBook.add("cowboys1");
        passwordBook.add("discords");
        passwordBook.add("zoomcall");
        passwordBook.add("vidogame");
        System.out.println("You are a hacker man!");
        System.out.println("A man that hacks!");
        System.out.println("You work for a business to hack other peoples hacks before they hurt peoples personal life.");
        System.out.println("One day, a hacker that you have been tracking down for years starts to hack your computer!");
        System.out.println("You are still very tired and exhausted from hacking with your friends last night and forgot the password to run your program");
        System.out.println("You pull out your password book out!");
        System.out.println("You have 3 attempts to try and stop HackerAnonymous!");
        System.out.print("Press enter to continue:");
        System.out.print("");
        in.nextLine();
        while (true) {
            System.out.println("");
            System.out.println("[PASSWORDS]");
            for (String i : passwordBook) {
                System.out.println(i);
            }
            System.out.println("");
            System.out.print("Guess: ");
            String hacks = in.nextLine();
            String hack = hacks.toLowerCase();
            if (hack.equals(coder)) {
                System.out.println("You successfully stopped the hack, congratulations!");
                break;
            } else if (code.attempts == 2) {
                System.out.println("Your computer is hacked, your files are now posted everywhere and now your fired from your job...");
                break;
            } else if (passwordBook.contains(hack)) {
                System.out.println("Oh no, that was not it, try it again! Hurry!");
                passwordBook.remove(hack);
                code.attempts++;
            } else {
                System.out.println("Thats not in the password book! Try reading again!");
                code.attempts++;
            }
        }
    }
}
