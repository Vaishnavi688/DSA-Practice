package Patterns;

public class Inverted_halfpyramid_number {
    public static void inverted_halfpyramid_number(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+ " ");
            }
           
            System.out.println(); 
        }
    }
    public static void main(String Args[]){
        inverted_halfpyramid_number(5);;
    }
}
