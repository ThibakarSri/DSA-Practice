import java.util.ArrayList;
import java.util.List;

public class MultipleMissingValue {
    public static void main(String [] args){
        int [] arr = {1,2,5,7,9,12};

        List<Integer> missingValues = new ArrayList<>();

        for(int i=0; i<arr.length-1; i++){
            int current = arr[i];
            int next = arr[i+1];

            while( next - current > 1 ){
                current++;
                missingValues.add(current);
            }
        }
        if(missingValues.isEmpty()){
            System.out.println("No missing values found.");
        } else {
            System.out.println("Missing numbers: "+ missingValues);
        }
    }

}
