class Solution {
    // public void rotate(int[] nums, int k) {
    //     int step = k % nums.length;
    //     for (int i = 0; i < step; i++) {
    //         stepOne(nums);
    //     }
    // }

    // public void stepOne(int[] nums) {
    //     int value = nums[nums.length - 1];
    //     for (int i = nums.length - 1; i > 0; i--) {
    //         nums[i] = nums[i - 1];
    //     }
    //     nums[0] = value;
    // }

    public void rotate(int[] nums, int k) {
        int step = k % nums.length;
        int count = 0;
        for (int i = 0; count < nums.length; i++) {
            int current = i;
            int value = nums[i];
            do {
                int next = (current + step) % nums.length;
                int temp = nums[next];
                nums[next] = value;
                value = temp;
                current = next;
                count++;
            } while (i != current);
        }
    }
}