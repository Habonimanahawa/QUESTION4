import java.util.Scanner;

//Question 4
public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter 10 integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Call the methods
        displayIntegers(numbers);
        displayIntegersInReverse(numbers);
        displaySum(numbers);
        displayValuesLessThan12(numbers);
        displayValuesGreaterThanAverage(numbers);
    }

    // Method 1: Display all integers
    public static void displayIntegers(int[] numbers) {
        System.out.println("\nIntegers in the array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Method 2: Display integers in reverse order
    public static void displayIntegersInReverse(int[] numbers) {
        System.out.println("\nIntegers in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // Method 3: Display the sum of the integers
    public static void displaySum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("\nSum of the integers: " + sum);
    }

    // Method 4: Display all values less than 12 or a message if none are less than 12
    public static void displayValuesLessThan12(int[] numbers) {
        boolean found = false;
        System.out.println("\nValues less than 12:");
        for (int number : numbers) {
            if (number < 12) {
                System.out.print(number + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No values less than 12.");
        } else {
            System.out.println();
        }
    }

    // Method 5: Display all values greater than the calculated average
    public static void displayValuesGreaterThanAverage(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;

        System.out.println("\nValues greater than the average (" + average + "):");
        boolean found = false;
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No values greater than the average.");
        } else {
            System.out.println();
        }
    }
}