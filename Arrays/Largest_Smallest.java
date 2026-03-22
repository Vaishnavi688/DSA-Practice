package Arrays;
import java.util.*;
public class Largest_Smallest {
    public static void largest_smallest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number :" +smallest);
        System.out.println("The largest number :" +largest);

    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        largest_smallest(numbers);
    }
}
