// Question,

// 3
// 5 4
// 8 7 6
// 12 11 10 9

import java.util.Scanner;


public class UniquePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = 4;
        int start = 2;

        for (int i=1; i<=line; i++){
            start += i;
            int temp = start;

            for (int j = 1; j<=i; j++){
                System.out.print(temp + " ");
                temp--;
            }
            System.out.println();
        }




    }
}
