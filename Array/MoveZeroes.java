
public class MoveZeroes {

    // Function to move zeroes to end
    public static void moveZeroes(int[] nums) {
        int index = 0;

        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill remaining positions with zeroes
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    // Helper function to print array
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method (entry point)
    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        System.out.print("Original Array: ");
        printArray(nums);

        moveZeroes(nums);

        System.out.print("After Moving Zeroes: ");
        printArray(nums);
    }
}