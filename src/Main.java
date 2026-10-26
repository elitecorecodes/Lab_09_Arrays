import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] dataPoints = new int[100];


        Random generator = new Random();


        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = generator.nextInt(100) + 1;
        }
        // Step 3: Display all values in the dataPoints array
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);

            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Step 4: Calculate the sum and average
        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.printf("The average of the random array dataPoints is: %.2f%n", average);
        // Step 5: Prompt the user for a number between 1 and 100
        Scanner in = new Scanner(System.in);

        int userValue = SafeInput.getRangedInt(
                in,
                "Enter an integer between 1 and 100",
                1,
                100
        );
        // Step 6: Count how many times the user's number appears
        int matchCount = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                matchCount++;
            }
        }

        System.out.println("The number " + userValue +
                " appears " + matchCount + " time(s) in the array.");


        // Step 7: Find the first occurrence using a linear search
        int searchValue = SafeInput.getRangedInt(
                in,
                "Enter another integer between 1 and 100",
                1,
                100
        );

        int foundIndex = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("The value " + searchValue +
                    " was found at array index " + foundIndex + ".");
        } else {
            System.out.println("The value " + searchValue +
                    " was not found in the array.");
        }


        // Step 8: Find the minimum and maximum values in dataPoints
        int minValue = dataPoints[0];
        int maxValue = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < minValue) {
                minValue = dataPoints[i];
            }

            if (dataPoints[i] > maxValue) {
                maxValue = dataPoints[i];
            }
        }

        System.out.println("The minimum value in the dataPoints array is: " + minValue);
        System.out.println("The maximum value in the dataPoints array is: " + maxValue);




    }
}