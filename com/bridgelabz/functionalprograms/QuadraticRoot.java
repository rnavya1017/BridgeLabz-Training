package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class QuadraticRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double delta = b * b - 4 * a * c;

        if(delta > 0) {

            double root1 =
                    (-b + Math.sqrt(delta))
                            / (2 * a);

            double root2 =
                    (-b - Math.sqrt(delta))
                            / (2 * a);

            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);

        }
        else if(delta == 0) {

            double root =
                    -b / (2 * a);

            System.out.println(
                    "Both roots are equal");

            System.out.println(
                    "Root = " + root);
        }
        else {

            System.out.println(
                    "Roots are imaginary");
        }



    }
}
