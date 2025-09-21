import java.util.Scanner;

public class PracticeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the operation (sum_even, product_odd, sum_divisible, count_prime): ");
        String operation = scanner.next();
        
        int result = smartCalculate(numbers, operation);
        System.out.println("Result: " + result);
    }
    
    public static int smartCalculate(int[] numbers, String operation) {
        switch (operation) {
            case "sum_even":
                return sumEven(numbers);
            case "product_odd":
                return productOdd(numbers);
            case "sum_divisible":
                return sumDivisible(numbers);
            case "count_prime":
                return countPrime(numbers);
            default:
                System.out.println("Invalid operation.");
                return -1;
        }
    }
    
    public static int sumEven(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int productOdd(int[] numbers) {
        int product = 1;
        boolean hasOdd = false;
        for (int num : numbers) {
            if (num % 2 != 0) {
                product *= num;
                hasOdd = true;
            }
        }
        return hasOdd ? product : 0;
    }

    public static int sumDivisible(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 3 == 0 || num % 5 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int countPrime(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
