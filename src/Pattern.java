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


        System.out.println();
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }


        System.out.println();
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=lines-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        System.out.println();
        int num =1;
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }

        System.out.println();
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }


        // Alphabet Triangle
        System.out.println();
        char chr = 'A';
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=lines-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(chr++ + " ");
            }
            System.out.println();
        }


        System.out.println();
        for(int i=1; i<=lines; i++){
            char charr = 'A';
            for(int j=1; j<=lines-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(charr++ + " ");
            }
            System.out.println();
        }
    }


}



