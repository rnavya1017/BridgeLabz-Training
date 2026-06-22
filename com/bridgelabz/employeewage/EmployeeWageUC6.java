package com.bridgelabz.employeewage;



public class EmployeeWageUC6 {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;

    static final int EMP_RATE_PER_HOUR = 20;
    static final int PART_TIME_HOURS = 4;
    static final int FULL_TIME_HOURS = 8;

    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {

        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        while (totalEmpHours < MAX_WORKING_HOURS &&
                totalWorkingDays < MAX_WORKING_DAYS) {

            totalWorkingDays++;

            int empHours = 0;

            int empCheck = (int) (Math.random() * 3);

            switch (empCheck) {

                case IS_PART_TIME:
                    empHours = PART_TIME_HOURS;
                    break;

                case IS_FULL_TIME:
                    empHours = FULL_TIME_HOURS;
                    break;

                default:
                    empHours = 0;
            }

            totalEmpHours += empHours;

            System.out.println("Day " + totalWorkingDays +
                    " : Employee Hours = " + empHours);
        }

        int totalEmpWage = totalEmpHours * EMP_RATE_PER_HOUR;

        System.out.println("\nTotal Working Days = "
                + totalWorkingDays);

        System.out.println("Total Working Hours = "
                + totalEmpHours);

        System.out.println("Total Employee Wage = "
                + totalEmpWage);
    }
}