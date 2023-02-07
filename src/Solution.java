import java.util.*;

/*class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int temp = 0;
        for (int i = 1; i < n; i++) {
            temp = nums[i];
            nums[i] = nums[i + n - 1];
            nums[i + n - 1] = temp;
        }
        for (int i = 2; i < n * 2 - 2; i = i + 2) {
            temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {7,5,9,7,5,8,10,4,3,3,2,5,9,10};
        System.out.println(Arrays.toString(shuffle(nums, 7)));
    }
}*/
class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[n * 2];
        int j = 0;
        for (int i = 0; i < n * 2; i = i + 2) {
            res[i] = nums[j];
            res[i+1] = nums[j + n];
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(nums, 4)));
    }
}