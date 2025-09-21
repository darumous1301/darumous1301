import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start value: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end value: ");
        int end = scanner.nextInt();
        System.out.print("Enter two divisors (separated by space): ");
        int divisor1 = scanner.nextInt();
        int divisor2 = scanner.nextInt();
        
        int[] divisors = {divisor1, divisor2};
        int[] results = enhancedFizzBuzz(start, end, divisors);
        
        System.out.println("Final Sum: " + results[0]);
        System.out.println("Final Product: " + results[1]);
        System.out.println("Fizz Count: " + results[2]);
        System.out.println("Buzz Count: " + results[3]);
        System.out.println("FizzBuzz Count: " + results[4]);
    }
    
    public static int[] enhancedFizzBuzz(int start, int end, int[] divisors) {
        int sum = 0;
        int product = 1;
        int fizzCount = 0;
        int buzzCount = 0;
        int fizzBuzzCount = 0;
        
        for (int i = start; i <= end; i++) {
            if (i % divisors[0] == 0 && i % divisors[1] == 0) {
                System.out.print("FizzBuzz ");
                sum += i;
                product *= i;
                fizzBuzzCount++;
            } else if (i % divisors[0] == 0) {
                System.out.print("Fizz ");
                sum += i;
                fizzCount++;
            } else if (i % divisors[1] == 0) {
                System.out.print("Buzz ");
                product *= i;
                buzzCount++;
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        return new int[] {sum, product, fizzCount, buzzCount, fizzBuzzCount};
    }
}
