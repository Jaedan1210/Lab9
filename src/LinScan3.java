import java.util.Random;
import java.util.Scanner;
public class LinScan3 {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];

        Random rnd = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(); // Move to a new line after displaying all of the values
        Scanner scanner = new Scanner(System.in);
        int userValue1 = SafeInput.getRangedInt(scanner, "Please enter a value that is between 1 and 100", 1, 100);
        System.out.println("You entered: " + userValue1);
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue1) {
                count++;
            }
        }
        System.out.println("The value " + userValue1 + " was found " + count + " time(s) in the dataPoints array.");

        int userValue2 = SafeInput.getRangedInt(scanner, "Please enter another value that is between 1 and 100", 1, 100);
        System.out.println("You entered: " + userValue2);


        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue2) {
                System.out.println("The value " + userValue2 + " was found at array index " + i + ".");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The value " + userValue2 + " was not found in the dataPoints array.");
        }
        scanner.close();
    }
}

