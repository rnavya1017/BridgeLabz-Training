package com.bridgelabz.employeewage;


public class EmployeeWageUC3 {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {

        int empHours = 0;
        int empWage;

        // Generates 0, 1, or 2
        int empCheck = (int) (Math.random() * 3);

        switch (empCheck) {

            case IS_PART_TIME:
                empHours = 4;
                System.out.println("Employee is Part Time");
                break;

            case IS_FULL_TIME:
                empHours = 8;
                System.out.println("Employee is Full Time");
                break;

            default:
                empHours = 0;
                System.out.println("Employee is Absent");
        }

        empWage = empHours * EMP_RATE_PER_HOUR;

        System.out.println("Employee Hours = " + empHours);
        System.out.println("Employee Wage = " + empWage);
    }
}