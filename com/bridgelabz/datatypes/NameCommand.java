package com.bridgelabz.datatypes;
public class NameCommand {
    public static void main(String[] args) {

        if (args.length > 0) {
            System.out.println("Your name is: " + args[0]);
        } else {
            System.out.println("Please enter your name.");
        }
    }
}