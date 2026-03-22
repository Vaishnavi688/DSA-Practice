package Patterns;

public class Bridge {
    public static void bridge(int n){
        for(int i=1; i<=n; i++){
            if(i==1){
                for(int j=1; j<=2*n-1; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
                for(int j=1; j<=2*i-3; j++){
                System.out.print(" ");
            }
                for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        bridge(5);
    }
}
//also can use the same code from butterfly pattern the below one 
