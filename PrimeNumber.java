import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the prime number you want to find: ");
        
        int index = scanner.nextInt(); // Read the user's input
        
        if (index <= 0) {
            System.out.println("Invalid input. Index must be a positive integer.");
        } else {
            int prime = findPrimeByIndex(index);
            
            if (prime != -1) {
                System.out.println("Prime number at index " + index + " is: " + prime);
            } else {
                System.out.println("No prime found at index " + index);
            }
        }
        
        // Close the scanner to release resources
        scanner.close();
    }
    
    // Function to find the prime number by its index
    public static int findPrimeByIndex(int index) {
        if (index <= 0) {
            return -1; // Invalid input
        }
        
        int count = 0;
        int number = 2; // Start with the first prime number
        
        while (count < index) {
            if (isPrime(number)) {
                count++;
                if (count == index) {
                    return number;
                }
            }
            number++;
        }
        
        return -1; // Prime not found within the given range
    }
    
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
