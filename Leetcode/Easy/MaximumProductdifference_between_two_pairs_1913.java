package Leetcode.Easy;

public class MaximumProductdifference_between_two_pairs_1913 {
    public static int maxProductDifference(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(max1<nums[i]){
                max2=max1;
                max1=nums[i];
            }
            else if(max2<nums[i]){
                max2=nums[i];
            }
            if(min1>nums[i]){
                min2=min1;
                min1=nums[i];
            }
            else if(min2>nums[i]){
                min2 = nums[i];
            }
            
        }
        return (max1 * max2) - (min1 * min2);
       }   
       public static void main(String[] args) {
        int nums[] = {9,6,4,2,3,5,7,0,1};
        int r = maxProductDifference(nums);
        System.out.print(r);
    }
}
