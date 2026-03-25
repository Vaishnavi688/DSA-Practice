package Arrays;

public class Subarrays {
    public static void subarrays(int numbers[]){
        int ts = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total Subarrays : " +ts);
    }
    public static void main(String[] args) {
        int numbers[] = {5, 10, 15, 20, 25, 30};
        subarrays(numbers);
    }
}
