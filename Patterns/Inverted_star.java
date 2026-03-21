package Patterns;



public class Inverted_star {
   public static void inverted_star(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i+1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void main(String Args[]){
    inverted_star(5);
}

}
