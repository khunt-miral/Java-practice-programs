import java.util.Scanner;

// WAP to find a Factor of a given number (iterative and recursive)

public class Que3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number to find factor of that : ");
        int number = sc.nextInt();
        System.out.println("Using iterative method");
        findFactor(number);
        System.out.println("\nUsing Recursion");
        findFactorRecursive(number, 1);

    }

    // using iterative method
    static void findFactor(int input) {
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //using recursive method
    static void findFactorRecursive(int input, int increment) {
        
        if(increment <= input) {
            if(input % increment == 0) System.out.print(increment + " ");
            findFactorRecursive(input, increment + 1);
        }

        
    }
}
