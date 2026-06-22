package com.bridgelabz.employeewage;


public class EmployeeWageUC5 {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;

    static final int WAGE_PER_HOUR = 20;
    static final int PART_TIME_HOUR = 4;
    static final int FULL_TIME_HOUR = 8;
    static final int WORKING_DAYS = 20;

    public static void main(String[] args) {

        int totalEmpWage = 0;

        for (int day = 1; day <= WORKING_DAYS; day++) {

            int empHours = 0;

            int empCheck = (int)(Math.random() * 3);

            switch (empCheck) {

                case IS_PART_TIME:
                    empHours = PART_TIME_HOUR;
                    break;

                case IS_FULL_TIME:
                    empHours = FULL_TIME_HOUR;
                    break;

                default:
                    empHours = 0;
            }

            int dailyWage = empHours * WAGE_PER_HOUR;
            totalEmpWage += dailyWage;
        }

        System.out.println("Monthly Employee Wage = " + totalEmpWage);
    }
}