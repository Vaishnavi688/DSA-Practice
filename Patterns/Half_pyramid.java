package Patterns;

public class Half_pyramid {
    public static void half_pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j );
            }
            System.out.println();
        }
    }
    
    public static void main(String Args[]){
        half_pyramid(5);
    }
}
