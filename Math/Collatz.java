import java.util.Scanner;

public class Collatz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu options
            System.out.println("==============================================");
            System.out.println("         Collatz Conjecture Analysis           ");
            System.out.println("==============================================");
            System.out.println("1. Analyze a specific number");
            System.out.println("2. Analyze a range of numbers");
            System.out.println("3. Exit");
            System.out.println("==============================================");
            System.out.print("Select an option (1-3): ");

            int choice = getValidIntegerInput(scanner);

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter a number to analyze: ");
                    long number = getValidLongInput(scanner);
                    analyzeSingleNumber(number);
                }
                case 2 -> {
                    System.out.print("Enter the starting number of the range: ");
                    long start = getValidLongInput(scanner);
                    System.out.print("Enter the ending number of the range: ");
                    long end = getValidLongInput(scanner);

                    if (start > 0 && end > 0 && start <= end) {
                        analyzeRange(start, end);
                    } else {
                        System.out.println("Invalid range. Ensure both numbers are positive and start <= end.");
                    }
                }
                case 3 -> {
                    System.out.println("Exiting the program. Thank you for using the Collatz Analysis tool!");
                    return;
                }
                default -> System.out.println("Invalid option. Please select 1, 2, or 3.");
            }
        }
    }

    private static void analyzeSingleNumber(long number) {
        int iterations = 0;
        int largestNumber = (int) number;

        System.out.println("Analyzing Collatz sequence for " + number + "...");
        System.out.print("[" + number + "] => ");

        while (number > 1) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = (3 * number + 1);
            }

            iterations++;
            largestNumber = (int) Math.max(largestNumber, number);
            System.out.print("[" + number + "] => ");
        }

        System.out.println();
        System.out.println("Results:");
        System.out.println("Number of iterations: " + iterations);
        System.out.println("Largest number in the sequence: " + largestNumber);
        System.out.println("----------------------------------------------");
    }

    private static void analyzeRange(long start, long end) {
        int globalMaxNumber = 0;
        long globalMaxNumberIndex = 0;
        int globalMaxIterations = 0;
        long globalMaxIterationsIndex = 0;

        System.out.println("Analyzing numbers from " + start + " to " + end + "...");

        for (long i = start; i <= end; i++) {
            int iterations = 0;
            int largestNumber = (int) i;
            long currentNumber = i;

            while (currentNumber > 1) {
                if (currentNumber % 2 == 0) {
                    currentNumber = currentNumber / 2;
                } else {
                    currentNumber = (3 * currentNumber + 1);
                }

                iterations++;
                largestNumber = (int) Math.max(largestNumber, currentNumber);
            }

            if (largestNumber > globalMaxNumber) {
                globalMaxNumber = largestNumber;
                globalMaxNumberIndex = i;
            }

            if (iterations > globalMaxIterations) {
                globalMaxIterations = iterations;
                globalMaxIterationsIndex = i;
            }

            System.out.println("Starting number: " + i + ", Iterations: " + iterations + ", Largest number: " + largestNumber);
        }

        System.out.println("==============================================");
        System.out.println("Summary for range " + start + " to " + end + ":");
        System.out.println("Largest number overall: " + globalMaxNumber + " (Starting number: " + globalMaxNumberIndex + ")");
        System.out.println("Maximum iterations: " + globalMaxIterations + " (Starting number: " + globalMaxIterationsIndex + ")");
        System.out.println("==============================================");
    }

    private static int getValidIntegerInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    private static long getValidLongInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextLong();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }
    }
}
