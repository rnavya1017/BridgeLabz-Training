

/**
 * UC3:
 * Program to find the maximum of three String values.
 * Uses compareTo() method as specified in the assignment.
 */
 class MaximumString {


    public static String testMaximum(String first, String second, String third) {

        // Assume first String is the maximum
        String max = first;

        // Compare second String with current maximum
        if (second.compareTo(max) > 0) {
            max = second;
        }

        // Compare third String with current maximum
        if (third.compareTo(max) > 0) {
            max = third;
        }

        // Return the largest String
        return max;
    }
}
public class MaxMinUC3 {

    public static void main(String[] args) {

        System.out.println("========== UC3 : Maximum of Three Strings ==========\n");

        // ---------------------------------------------------
        // TC 3.1
        // Maximum String is at First Position
        // Expected Output : Zebra
        // ---------------------------------------------------
        String result1 = MaximumString.testMaximum("Zebra", "Apple", "Banana");

        if (result1.equals("Zebra")) {
            System.out.println("TC 3.1 Passed");
        } else {
            System.out.println("TC 3.1 Failed");
        }

        System.out.println("Expected : Zebra");
        System.out.println("Actual   : " + result1);
        System.out.println();


        // ---------------------------------------------------
        // TC 3.2
        // Maximum String is at Second Position
        // Expected Output : Zebra
        // ---------------------------------------------------
        String result2 = MaximumString.testMaximum("Apple", "Zebra", "Banana");

        if (result2.equals("Zebra")) {
            System.out.println("TC 3.2 Passed");
        } else {
            System.out.println("TC 3.2 Failed");
        }

        System.out.println("Expected : Zebra");
        System.out.println("Actual   : " + result2);
        System.out.println();


        // ---------------------------------------------------
        // TC 3.3
        // Maximum String is at Third Position
        // Expected Output : Zebra
        // ---------------------------------------------------
        String result3 = MaximumString.testMaximum("Apple", "Banana", "Zebra");

        if (result3.equals("Zebra")) {
            System.out.println("TC 3.3 Passed");
        } else {
            System.out.println("TC 3.3 Failed");
        }

        System.out.println("Expected : Zebra");
        System.out.println("Actual   : " + result3);
        System.out.println();

        System.out.println("========== All UC3 Test Cases Executed ==========");
    }
}