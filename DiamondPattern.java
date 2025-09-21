import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size (odd number >= 1): ");
        int size = scanner.nextInt();
        
        if (size % 2 == 0 || size < 1) {
            System.out.println("Invalid input! Size must be an odd number and >= 1.");
        } else {
            printDiamondPattern(size);
        }
    }
    
    public static void printDiamondPattern(int size) {
        // Print the upper half including the middle row
        for (int i = 1; i <= size; i += 2) {
            for (int j = 0; j < (size - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Print the lower half
        for (int i = size - 2; i >= 1; i -= 2) {
            for (int j = 0; j < (size - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

