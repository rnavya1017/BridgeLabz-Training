

/**
 * UC4:
 * Refactor UC1, UC2 and UC3 into one Generic Method.
 * The generic type extends Comparable so that compareTo()
 * can be used for comparison.
 */
class MaximumGeneric {

    public static <T extends Comparable<T>> T testMaximum(T first, T second, T third) {

        // Assume first value is maximum
        T max = first;

        // Compare second value
        if (second.compareTo(max) > 0) {
            max = second;
        }

        // Compare third value
        if (third.compareTo(max) > 0) {
            max = third;
        }

        // Return maximum value
        return max;
    }
}

public class MaxMinUC4 {

    public static void main(String[] args) {

        System.out.println("========== UC4 : Generic Maximum ==========\n");

        // =====================================================
        // INTEGER TEST CASES
        // =====================================================

        System.out.println("----- Integer Test Cases -----");

        Integer intResult1 = MaximumGeneric.testMaximum(50, 20, 30);
        System.out.println("TC 4.1 : " + intResult1);

        Integer intResult2 = MaximumGeneric.testMaximum(20, 50, 30);
        System.out.println("TC 4.2 : " + intResult2);

        Integer intResult3 = MaximumGeneric.testMaximum(20, 30, 50);
        System.out.println("TC 4.3 : " + intResult3);

        System.out.println();


        // =====================================================
        // FLOAT TEST CASES
        // =====================================================

        System.out.println("----- Float Test Cases -----");

        Float floatResult1 = MaximumGeneric.testMaximum(55.5f, 20.5f, 30.5f);
        System.out.println("TC 4.4 : " + floatResult1);

        Float floatResult2 = MaximumGeneric.testMaximum(20.5f, 55.5f, 30.5f);
        System.out.println("TC 4.5 : " + floatResult2);

        Float floatResult3 = MaximumGeneric.testMaximum(20.5f, 30.5f, 55.5f);
        System.out.println("TC 4.6 : " + floatResult3);

        System.out.println();


        // =====================================================
        // STRING TEST CASES
        // =====================================================

        System.out.println("----- String Test Cases -----");

        String stringResult1 = MaximumGeneric.testMaximum("Zebra", "Apple", "Banana");
        System.out.println("TC 4.7 : " + stringResult1);

        String stringResult2 = MaximumGeneric.testMaximum("Apple", "Zebra", "Banana");
        System.out.println("TC 4.8 : " + stringResult2);

        String stringResult3 = MaximumGeneric.testMaximum("Apple", "Banana", "Zebra");
        System.out.println("TC 4.9 : " + stringResult3);

        System.out.println("\n========== All UC4 Test Cases Passed ==========");
    }
}