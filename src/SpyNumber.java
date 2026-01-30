import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try{
            int num = input.nextInt();
            int sum = 0;
            int product = 1;
            int temp = num;
            while(num != 0){
                int rem = num % 10;
                sum = sum + rem;
                product = product * rem;
                num = num / 10;
            }
            if(sum == product){
                System.out.println(temp + " is a Spy Number.");
            } else {
                System.out.println(temp + " is not a Spy Number.");
            }

        } catch (Exception e){
            System.out.println("You entered an invalid number. "+ e.getMessage());
        }
    }
}
