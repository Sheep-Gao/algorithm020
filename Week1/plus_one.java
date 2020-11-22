class Solution {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                result[i + 1] = 0;
                if (i == 0) {
                    result[0] = 1;
                    return result;
                }
                digits[i] = 0;
                continue;
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        return digits;
    }
}