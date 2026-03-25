package Arrays;
import java.util.*;

public class Pairs {
    public static void printPairs(int numbers[]){
        int tp = 0;
        for(int i=0; i<numbers.length; i++){
            int current = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + current + "," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs :" +tp);
    }
    public static void main(String[] args) {
        int numbers[] = {5, 10, 15, 20, 25, 30};
        printPairs(numbers);
    }
}
