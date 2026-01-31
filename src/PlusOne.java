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

        System.out.println();

        // Process of Plus one
        for(int i = length -1; i >= 0; i-- ){
            if(arr[i] < 9) {
                arr[i] = arr[i] + 1;
                break;
            } else
            {
                arr[i] = 0;
                arr[i-1] = arr[i-1] + 1;
                break;
            }

        }
        System.out.print("Elements of the array after plus one: ");
        for(int value: arr){
            System.out.print(value + " ");
        }

    }
}
