package Arrays;
import java.util.*;
// dataType arrayName[] = new dataType[size];
public class Linear_search {
    public static int linearSearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 20;
        int index = linearSearch(numbers, key);
        if(index==-1){
            System.out.print("Not found the key!");
        }
        else {
            System.out.print("Key found at index :" +index);
        }
    }
}