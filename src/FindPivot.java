public class FindPivot {

    public static int findPivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Step 1: Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        // Step 2: Find pivot index
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i; // Pivot index found
            }
            leftSum += nums[i];
        }

        return -1; // No pivot index exists
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};

        int pivotIndex = findPivotIndex(nums);

        if (pivotIndex != -1) {
            System.out.println("Pivot Index: " + pivotIndex);
        } else {
            System.out.println("No Pivot Index Found");
        }
    }
}
