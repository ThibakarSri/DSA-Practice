import java.util.Scanner;

public class BubbleSort {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = input.nextInt();
        int [] arr = new int [n];
        for (int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Before sorting: ");
        for(int value: arr){
            System.out.println(value);
        }
        System.out.println();


        // Sorting process
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("After sorting: ");
        for(int value: arr){
            System.out.println(value);
        }
    }
}
