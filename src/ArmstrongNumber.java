// 153 => 1^3 + 5^3 + 3^3 = 153
//
//

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;
        int temp = number;

        while( number !=0 ) {
            int digit = number % 10;
            sum = sum + (digit*digit*digit);
            number /= 10;
        }
        if (sum == temp){
            System.out.println( temp + " is armstrong Number");
        }
        else {
            System.out.println( temp + " is not armstrong Number");
        }
    }
}
