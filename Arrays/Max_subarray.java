package Arrays;

public class Max_subarray {
    public static void maxsubarray(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                currSum =0;
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k] + " ");
                    currSum = currSum + numbers[k];
                }
                System.out.print("Sum:"+currSum);
                System.out.println();
                if(maxSum<currSum){
                    maxSum=currSum;
                }
                if(minSum>currSum){
                    minSum=currSum;
                }
            }
            System.out.println();
        }
        System.out.println("The max sum:"+maxSum);
        System.out.println("The min sum:"+minSum);
    }
    public static void main(String[] args) {
        int numbers[] = {5, 10, 15, 20, 25, 30};
        maxsubarray(numbers);

    }
}
