import java.util.Arrays;

public class SecondHighestnumber {
    public static void main(String args []){
    
    int[] numbers = {12, 35, 1, 10, 34, 1};
        System.out.println("Second Largest: " + findSecondLargest(numbers));

        int[] number = {12, 45, 40, 10, 30, 41};
    
        // Find the second largest number using java8 code
        int secondLargest = Arrays.stream(number)
                                  .distinct() // Remove duplicates
                                  .sorted()  // Sort in ascending order
                                  .skip(number.length - 2) // Skip to the second last element
                                  .findFirst()
                                  .orElseThrow(() -> new IllegalArgumentException("Array must have at least two distinct elements"));

                                  /*
                                   * .distinct() // Remove duplicates
                                  .boxed()    // Convert to Integer stream
                                  .sorted((a, b) -> b - a) // Sort in descending order
                                  .skip(1)    // Skip the largest number
                                  .findFirst()
                                   */
        System.out.println("Second Largest Number: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        /*
         * Logic:
       If a number is greater than largest, update secondLargest to largest and then update largest.
       If a number is greater than secondLargest but not equal to largest, update secondLargest.
         */
         //using simple java without predefined methods.
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
         //  4 6 2 7 9 5 8
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
}
}
