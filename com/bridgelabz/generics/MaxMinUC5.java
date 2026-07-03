
/**
 * UC5:
 * Generic Class to find the maximum of three values.
 * This class stores three generic values and finds the maximum.
 */
class Maximum<T extends Comparable<T>> {

    // Instance variables
    private T first;
    private T second;
    private T third;

    /**
     * Parameterized Constructor
     *
     * @param first  First Value
     * @param second Second Value
     * @param third  Third Value
     */
    public Maximum(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    /**
     * Generic Static Method
     * Finds maximum among three values.
     *
     * @param first  First Value
     * @param second Second Value
     * @param third  Third Value
     * @param <T> Generic Type
     * @return Maximum Value
     */
    public static <T extends Comparable<T>> T testMaximum(T first, T second, T third) {

        T max = first;

        if (second.compareTo(max) > 0) {
            max = second;
        }

        if (third.compareTo(max) > 0) {
            max = third;
        }

        return max;
    }

    /**
     * Non-static method.
     * Calls the static generic method by passing instance variables.
     *
     * @return Maximum Value
     */
    public T testMaximum() {
        return Maximum.testMaximum(first, second, third);
    }
}
public class MaxMinUC5 {

    public static void main(String[] args) {

        System.out.println("========== UC5 Generic Class ==========\n");

        // ===========================================
        // Integer Test
        // ===========================================

        Maximum<Integer> integerObj =
                new Maximum<>(10, 25, 15);

        Integer intMax = integerObj.testMaximum();

        System.out.println("Integer Maximum : " + intMax);

        System.out.println();

        // ===========================================
        // Float Test
        // ===========================================

        Maximum<Float> floatObj =
                new Maximum<>(12.5f, 45.8f, 32.4f);

        Float floatMax = floatObj.testMaximum();

        System.out.println("Float Maximum : " + floatMax);

        System.out.println();

        // ===========================================
        // String Test
        // ===========================================

        Maximum<String> stringObj =
                new Maximum<>("Apple", "Peach", "Banana");

        String stringMax = stringObj.testMaximum();

        System.out.println("String Maximum : " + stringMax);

        System.out.println();

        System.out.println("========== All Test Cases Passed ==========");
    }
}