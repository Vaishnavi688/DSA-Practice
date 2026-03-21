package Patterns;

public class Hollow_rhombus {
    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
        if(i==1 || i==n){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
        }
        else{
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=1; j++){
                System.out.print("*");
            }
            for(int j=1; j<=n-2; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=1; j++){
                System.out.print("*");
            }
        }
        System.out.println();
        }
        
    }
    public static void main(String Args[]){
        hollow_rhombus(5);;
    }
}
