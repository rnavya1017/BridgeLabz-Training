package com.bridgelabz.employeewage;

public class EmployeAttendance {

    public static void main(String[] args) {

        int attendance = (int) (Math.random() * 2);

        if (attendance == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
