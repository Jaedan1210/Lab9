import java.util.Random;
import java.util.Scanner;

public class LinScan4 {

    public static void main(String[] args) {
        // Declare and initialize an array of 100 integers
        int[] dataPoints = new int[100];

        Random rnd = new Random();


        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Display values in a single line separated by " | "
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int userValue1 = SafeInput.getRangedInt(scanner, "Please enter a value between 1 and 100", 1, 100);
        System.out.println("You entered: " + userValue1);

        // Count occurrences of userValue in dataPoints
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue1) {
                count++;
            }
        }

        System.out.println("The value " + userValue1 + " was found " + count + " time(s) in the dataPoints array.");

        int userValue2 = SafeInput.getRangedInt(scanner, "Please enter another value between 1 and 100", 1, 100);
        System.out.println("You entered: " + userValue2);

        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue2) {
                System.out.println("The value " + userValue2 + " was found at array index " + i + ".");
                found = true; // Set to true
                break;
            }
        }

        if (!found) {
            System.out.println("The value " + userValue2 + " was not found in the dataPoints array.");
        }
        int minValue = dataPoints[0];
        int maxValue = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < minValue) {
                minValue = dataPoints[i]; // Update minValue if current is lower
            }
            if (dataPoints[i] > maxValue) {
                maxValue = dataPoints[i]; // Update maxValue if current is higher
            }
        }

        System.out.println("The Minimum value in the dataPoints array is: " + minValue);
        System.out.println("The Maximum value in the dataPoints array is: " + maxValue);

        scanner.close();
    }
}

