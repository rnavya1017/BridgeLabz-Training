package com.bridgelabz.employeewage;


import java.util.Scanner;

public class DailyEmployeeWage {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int wagePerHour = sc.nextInt();
        int fullDayHours = sc.nextInt();

        int dailyWage = wagePerHour * fullDayHours;

        System.out.println("Wage Per Hour = " + wagePerHour);
        System.out.println("Full Day Hours = " + fullDayHours);
        System.out.println("Daily Employee Wage = " + dailyWage);
    }
}