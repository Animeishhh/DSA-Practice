

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        int n = nums.length;

        int leftProduct = 1;
        int rightProduct = 1;
        int ans = nums[0];

        for (int i = 0; i < n; i++) {

            // reset if product becomes 0
            if (leftProduct == 0) leftProduct = 1;
            if (rightProduct == 0) rightProduct = 1;

            // multiply from left
            leftProduct *= nums[i];

            // multiply from right
            rightProduct *= nums[n - 1 - i];

            // update answer
            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};

        int result = maxProduct(nums);
        System.out.println("Maximum Product Subarray: " + result);
    }
}