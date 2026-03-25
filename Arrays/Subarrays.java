package Arrays;

public class Subarrays {
    public static void subarrays(int numbers[]){
        int ts = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            int sum = 0;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                sum = sum + numbers[j];
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                max = Math.max(max, sum);
                min = Math.min(min, sum);
                System.out.print("The sum is:"+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays : " +ts);
        System.out.println("Max sum :" +max);
        System.out.println("Min sum :" +min);
    }
    public static void main(String[] args) {
        int numbers[] = {5, 10, 15, 20, 25, 30};
        subarrays(numbers);
    }
}
