package com.bridgelabz.functionalprograms;
import java.util.Scanner;
        public class WindChill {
            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter temperature (Fahrenheit): ");
                double t = sc.nextDouble();

                System.out.print("Enter wind speed (mph): ");
                double v = sc.nextDouble();

                if (Math.abs(t) > 50 || v < 3 || v > 120) {
                    System.out.println("Invalid input!");
                    System.out.println("Temperature must be <= 50");
                    System.out.println("Wind speed must be between 3 and 120");
                } else {

                    double w = 35.74
                            + 0.6215 * t
                            + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

                    System.out.printf("Wind Chill = %.2f", w);
                }

                sc.close();
            }
        }
