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
    public static float getShortestPath(String path) {
        int x = 0; int y = 0;
        for(int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);
            //South
            if(dir == 'S'){
                y--;
            }
            //North
            else if(dir =='N'){
                y++;
            }
            //East
            else if(dir == 'E'){
                x++;
            }
            //West
            else {
                x--;
            }
            
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static String substr(String str, int si, int ei) {
        String substr = "";
        for(int i=si; i<ei; i++) {
            substr += str.charAt(i);

        }
        return substr;
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
        String path = sc.nextLine();
        System.out.println(getShortestPath(path));
        String str = sc.nextLine();
        int si = sc.nextInt();
        int ei = sc.nextInt();
        System.out.println(str.substring(si, ei));
        System.out.println(substr(str, si, ei));
    }
}
