package BlockchainContract;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BlockchainContract {
    // Method to calculate the median of a double array
    public static double calculateMedian(double[] values) {
        double [] numbers = new double [values.length];
        for (int i = 0; i < values.length; i++)
        {
            numbers [i] = values [i];
        }
        Arrays.sort(numbers); // Sort the array
        int middle = numbers.length / 2;
        if (numbers.length % 2 == 1) { // Odd number of elements
            return numbers[middle];
        } else { // Even number of elements
            return (numbers[middle - 1] + numbers[middle]) / 2.0;
        }
    }

    // Method to calculate the mode of a double array
    public static double calculateMode(double[] numbers) {
        HashMap<Double, Integer> countMap = new HashMap<>();
        // Count the occurrences of each value
        for (double num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        double mode = numbers[0];
        int maxCount = 1;
        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        
        return mode;
    }

    // Main method to test the median and mode calculation
    public static void main(String[] args) {
        double[] numbers = {1.2, 2.3, 4.5, 6.7, 6.7, 2.3, 2.3, 4.5, 9.8};
        double median = calculateMedian(numbers);
        double mode = calculateMode(numbers);
        
        System.out.println("Given array: " + Arrays.toString(numbers));
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }
}