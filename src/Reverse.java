import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int rev = 0;

        while(num != 0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("Reversed Number is : "+rev);


//        System.out.print("Enter the String word : ");
//        String str = input.next();
        String str = "Hello World";
        char[] chars = str.toCharArray();

        String reverse = "";
        for(int i = chars.length-1; i>=0; i--){
            reverse = reverse + chars[i];
        }
        System.out.println("Reversed :" + reverse);
    }
}