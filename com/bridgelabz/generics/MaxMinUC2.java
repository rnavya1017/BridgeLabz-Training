
/**
 * UC2:
 * Program to find the maximum of three Float values.
 * Uses compareTo() method as specified in the assignment.
 */
class MaximumFloat {


    public static Float testMaximum(Float first, Float second, Float third) {

        // Assume first number is the maximum
        Float max = first;

        // Compare second value with current maximum
        if (second.compareTo(max) > 0) {
            max = second;
        }

        // Compare third value with current maximum
        if (third.compareTo(max) > 0) {
            max = third;
        }

        // Return the largest value
        return max;
    }
}

public class MaxMinUC2 {

    public static void main(String[] args) {

        System.out.println("========== UC2 : Maximum of Three Float Values ==========\n");

        // ---------------------------------------------------
        // TC 2.1
        // Maximum value is at First Position
        // Expected Output : 30.5
        // ---------------------------------------------------
        Float result1 = MaximumFloat.testMaximum(30.5f, 20.5f, 10.5f);

        if (result1.equals(30.5f)) {
            System.out.println("TC 2.1 Passed");
        } else {
            System.out.println("TC 2.1 Failed");
        }

        System.out.println("Expected : 30.5");
        System.out.println("Actual   : " + result1);
        System.out.println();


        // ---------------------------------------------------
        // TC 2.2
        // Maximum value is at Second Position
        // Expected Output : 45.8
        // ---------------------------------------------------
        Float result2 = MaximumFloat.testMaximum(15.5f, 45.8f, 25.2f);

        if (result2.equals(45.8f)) {
            System.out.println("TC 2.2 Passed");
        } else {
            System.out.println("TC 2.2 Failed");
        }

        System.out.println("Expected : 45.8");
        System.out.println("Actual   : " + result2);
        System.out.println();


        // ---------------------------------------------------
        // TC 2.3
        // Maximum value is at Third Position
        // Expected Output : 99.9
        // ---------------------------------------------------
        Float result3 = MaximumFloat.testMaximum(15.4f, 45.2f, 99.9f);

        if (result3.equals(99.9f)) {
            System.out.println("TC 2.3 Passed");
        } else {
            System.out.println("TC 2.3 Failed");
        }

        System.out.println("Expected : 99.9");
        System.out.println("Actual   : " + result3);
        System.out.println();

        System.out.println("========== All UC2 Test Cases Executed ==========");
    }
}