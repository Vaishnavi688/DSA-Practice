package Arrays;

public class Maxsubarraysum_prefix {
    public static void prefix(int numbers[]) {
    int currSum = 0;
    int maxSum =  Integer.MIN_VALUE;
    int minSum =  Integer.MAX_VALUE;
    int prefixSum[] = new int[numbers.length];
    prefixSum[0] = numbers[0];
    for(int i=1; i<prefixSum.length; i++){
        prefixSum[i] = prefixSum[i-1] + numbers[i];
    }
    for (int i=0; i<numbers.length; i++){
        int start = i;
        for(int j=i; j<numbers.length; j++){
            int end = j;
            currSum = 0;
            currSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start-1];
            if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
    }
    System.out.println("MaxSum is :" +maxSum);
}

    public static void main(String[] args) {
        int numbers[] = {5, 10, 15, 20, 25, 30};
        prefix(numbers);

    }

}
