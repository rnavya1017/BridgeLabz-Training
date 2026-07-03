
/**
 * UC1:
 * Program to find the maximum of three Integer values.
 * Uses compareTo() method as mentioned in the assignment.
 */
class MaximumInteger {

    public static Integer testMaximum(Integer first, Integer second, Integer third) {

        // Assume first number is maximum
        Integer max = first;

        // Compare second with current maximum
        if (second.compareTo(max) > 0) {
            max = second;
        }

        // Compare third with current maximum
        if (third.compareTo(max) > 0) {
            max = third;
        }

        // Return the largest value
        return max;
    }
}

class MaxMinUC1 {

    public static void main(String[] args) {

        System.out.println("========== UC1 : Maximum of Three Integers ==========\n");

        // -------------------------------
        // TC 1.1
        // Maximum number is at First Position
        // Expected Output : 30
        // -------------------------------
        Integer result1 = MaximumInteger.testMaximum(30, 20, 10);

        if (result1.equals(30)) {
            System.out.println("TC 1.1 Passed");
        } else {
            System.out.println("TC 1.1 Failed");
        }

        System.out.println("Expected : 30");
        System.out.println("Actual   : " + result1);
        System.out.println();


        // -------------------------------
        // TC 1.2
        // Maximum number is at Second Position
        // Expected Output : 40
        // -------------------------------
        Integer result2 = MaximumInteger.testMaximum(10, 40, 20);

        if (result2.equals(40)) {
            System.out.println("TC 1.2 Passed");
        } else {
            System.out.println("TC 1.2 Failed");
        }

        System.out.println("Expected : 40");
        System.out.println("Actual   : " + result2);
        System.out.println();


        // -------------------------------
        // TC 1.3
        // Maximum number is at Third Position
        // Expected Output : 60
        // -------------------------------
        Integer result3 = MaximumInteger.testMaximum(10, 20, 60);

        if (result3.equals(60)) {
            System.out.println("TC 1.3 Passed");
        } else {
            System.out.println("TC 1.3 Failed");
        }

        System.out.println("Expected : 60");
        System.out.println("Actual   : " + result3);
        System.out.println();

        System.out.println("========== All UC1 Test Cases Executed ==========");
    }
}