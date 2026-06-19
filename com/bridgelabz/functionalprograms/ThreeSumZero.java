package com.bridgelabz.functionalprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int count = 0;

        System.out.println("Triplets:");

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {

                    System.out.println(
                            arr[i] + " "
                                    + arr[left] + " "
                                    + arr[right]);

                    count++;

                    while (left < right &&
                            arr[left] == arr[left + 1]) {
                        left++;
                    }

                    while (left < right &&
                            arr[right] == arr[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        System.out.println("Total Triplets = " + count);

        sc.close();
    }
}
