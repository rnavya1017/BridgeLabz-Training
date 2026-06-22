package com.bridgelabz.programming;

import java.util.Scanner;
import java.util.Scanner;

public class AdjacentSum {

    public static void findSum(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = arr[i];

            if (i > 0) {
                sum += arr[i - 1];
            }

            if (i < n - 1) {
                sum += arr[i + 1];
            }

            System.out.print(sum + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findSum(arr);
    }
}