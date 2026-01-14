import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Reversed the entered number
        int reverse = 0;
        int num = number;
        while (num != 0) {
            reverse = reverse*10 + num % 10;
            num = num/10;
        }
        System.out.println( "Reversed number is " +reverse);

        if (number == reverse){
            System.out.println("So number " + number + " is a palindrome.");
        }
        else {
            System.out.println("So number " + number + " is not a palindrome.");
        }
    }
}