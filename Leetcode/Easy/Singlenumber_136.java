package Leetcode.Easy;

public class Singlenumber_136 {
    public static int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length;i++){
            result=result^nums[i];
        }
        return result;
    }
    public static void main(String Args[]){
        int nums[] = {4,1,2,1,2};
        int num = singleNumber(nums);
        System.out.print(num);
    }
}
