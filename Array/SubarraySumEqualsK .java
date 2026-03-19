package Array;

import java.util.*;

 class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        int res = 0;
        int curr = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // important

        for (int num : nums) {
            curr += num;

            res += map.getOrDefault(curr - k, 0);

            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        int result = subarraySum(nums, k);
        System.out.println("Number of subarrays: " + result);
    }
}
