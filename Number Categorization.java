public class Main {
    public static void main(String[] args) {
        int number = 100; // You can change this number to test different cases
    
        // Check if the number is positive
        if (number > 0) {
            // Check if the positive number is less than 10
            if (number < 10) {
                System.out.println("The number is positive and less than 10");
            }
            // If the number is not less than 10, it's greater than or equal to 10
            else {
                System.out.println("The number is positive and greater than or equal to 10");
            }
        }
        // If the number is not positive, it must be zero or negative
        else {
            System.out.println("The number is non-positive");
        }
    }
}
