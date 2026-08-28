import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        int temp = decimal;
        String binary = "";

        if (decimal == 0) {
            binary = "0";
        } else {

            while (temp > 0) {
                int remainder = temp % 2;  
                binary = remainder + binary; 
                temp = temp / 2;           
            }
        }

        System.out.println("Binary of " + decimal + " is: " + binary);

        scanner.close();
    }
}