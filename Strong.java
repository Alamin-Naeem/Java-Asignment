import java.util.Scanner;

public class Strong {
    
    public static int getFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int originalNum = scanner.nextInt();

        int temp = originalNum;
        int sum = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;          
            sum += getFactorial(lastDigit);      
            temp = temp / 10;                   
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is a Strong number.");
        } else {
            System.out.println(originalNum + " is NOT a Strong number.");
        }

        scanner.close();
    }
}