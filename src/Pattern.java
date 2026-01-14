import java.util.Scanner;

public class Pattern {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number of lines:");
        int lines = input.nextInt();

        for(int i=1; i<=lines; i++){
            for(int j=1; j<=lines-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


