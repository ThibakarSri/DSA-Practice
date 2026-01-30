import java.util.*;

public class PlusOne {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = input.nextInt();

        int[] arr = new int[length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }

        // Before plus one
        System.out.print("Elements of the array before plus one: ");
        for(int value: arr){
            System.out.print(value + " ");
        }

    }
}
