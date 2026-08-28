import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int temp = Math.abs(number);
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10; 
            sum += digit;          
            temp = temp / 10;      
        }

        System.out.println("Sum of digits of " + number + " is: " + sum);

        scanner.close();
    }
}