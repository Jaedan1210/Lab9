import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Scanner scanner = new Scanner(System.in);

        int lowerBound = SafeInput.getRangedInt(scanner, "Enter the lower bound for the random values", 1, 100);
        int upperBound = SafeInput.getRangedInt(scanner, "Enter the upper bound for the random values", lowerBound, 200);
        // Create an Random object
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(upperBound - lowerBound + 1) + lowerBound;
        }

        // Display the content of the arrays
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.println("dataPoints[" + i + "] = " + dataPoints[i]);
        }

        // Close Scanner
        scanner.close();
    }
}