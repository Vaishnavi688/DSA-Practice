package Patterns;

public class Star_cross {
    public static void star_cross(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j || i+j==n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        star_cross(7);
    }
}
