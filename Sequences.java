import java.util.Scanner;

class Sequences{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] seq = new int[5];
        System.out.print("Enter the first 5 elements of the sequence: ");
        for (int i = 0; i < 5; i++) seq[i] = sc.nextInt();
        
        int result = 0;
        int diff = seq[1] - seq[0];
        int ratio = seq[1] / seq[0];
        boolean isArithmetic = seq[4] - seq[3] == diff;
        boolean isGeometric = seq[0] != 0 && seq[3] != 0 && seq[1] % seq[0] == 0 && seq[4] % seq[3] == 0 && seq[4] / seq[3] == ratio;

        int n = 0;
        
        if (isArithmetic){
            System.out.print("Find which element: ");
            n = sc.nextInt();
            result = seq[0] + (n - 1) * diff;
            System.out.printf("Element %d is %d", n, result);
        }else if (isGeometric){
            System.out.print("Find which element: ");
            n = sc.nextInt();
            result = seq[0] * (int) Math.pow(ratio, n - 1);
            System.out.printf("Element %d is %d", n, result);
        }else {
            System.out.println("The sequence is neither arithmetic nor geometric.");
        }
        
        sc.close();
    }
}