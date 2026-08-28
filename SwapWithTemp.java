import java.util.Scanner;

public class SwapWithTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        System.out.println("Before Swap");
        System.out.println("a = " + a + ", b = " + b);

        int temp = a; 
        a = b;       
        b = temp;    

        System.out.println("After Swap");
        System.out.println("a = " + a + ", b = " + b);

        scanner.close();
    }
}