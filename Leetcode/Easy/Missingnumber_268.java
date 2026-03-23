package Leetcode.Easy;

public class Missingnumber_268 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
             sum = sum + nums[i];
        }
        int arsum = n*(n+1)/2;
        int result = arsum - sum;
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {9,6,4,2,3,5,7,0,1};
        int r = missingNumber(nums);
        System.out.print(r);
    }
}
