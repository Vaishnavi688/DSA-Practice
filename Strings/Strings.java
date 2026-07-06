package Strings;
import java.util.*;
public class Strings {
    public static boolean isPalindrome(String name) {
        int start = 0;
        int end = name.length()-1;
        for(int i=0; i<name.length()/2; i++) {
            if(name.charAt(start) != name.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main (String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        if(isPalindrome(name)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
