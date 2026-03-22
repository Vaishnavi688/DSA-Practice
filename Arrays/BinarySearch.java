package Arrays;
import java.util.*;
public class BinarySearch {
    public static int binarysearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;
        while(start<=end){
           int mid = (start + end)/2;
           if(numbers[mid]==key){
            return mid;
           }
           if(numbers[mid]<key){
            start = mid + 1;
           }
           else{
            end = mid - 1; 
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {5, 10, 15, 20, 30, 35, 40};
        int key = 35;
        int index = binarysearch(numbers, key);
        System.out.println("Element found at index :" +index);
    }
}