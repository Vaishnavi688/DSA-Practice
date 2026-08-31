package Recursion;

public class Decreasing_order {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int start, int n){
        if(start==n){
            System.out.println(n);
            return;
        }
        System.out.print(start+" ");
        printInc(start+1,n);
    }
    public static void main(String args[]){
        int n = 10;
        printDec(n);
        printInc(1,n);
    }
}
