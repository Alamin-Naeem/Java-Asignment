import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int originalNum = scanner.nextInt();

        int num = originalNum; 
        int reversedNum = 0;   

  
        while (num > 0) {
            int remainder = num % 10;                     
            reversedNum = (reversedNum * 10) + remainder; 
            num = num / 10;                               
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome number.");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome number.");
        }

        scanner.close();
    }
}