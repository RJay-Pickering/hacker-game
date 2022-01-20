package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        scramble code = new scramble();
        String coder = code.chooseAnswer();
        System.out.println(coder);
        System.out.println("You are a hacker man!");
        System.out.println("A man that hacks!");
        System.out.println("You work for a business to hack other peoples hacks before they hurt peoples personal life.");
        System.out.println("One day, a hacker that you have been tracking down for years starts to hack your computer!");
        System.out.println("You are still very tired and exhausted from partying with your friends last night and forgot the password to run your program");
        System.out.println("You pull out your password book out!");
        System.out.println("You have 3 attempts to try and stop HackerAnonymous");
        while (true) {
            System.out.println("passwords: ");
            System.out.println("password, passhack, hackmans, gokachus, 12345678, cyborg12, voodoovp, cowboys1, discords, zoomcall, vidogame");
            System.out.print("Guess: ");
            String hack = in.nextLine();
            if (hack.equals(coder)) {
                System.out.println("You successfully stopped the hack, congratulations!");
                break;
            } else if (code.attempts == 2) {
                System.out.println("Your computer is hacked, your files are now posted everywhere and now your fired from your job...");
                break;
            } else {
                System.out.println("Oh no, that was not it, try it again! Hurry!");
                code.attempts++;
            }
        }
    }
}
