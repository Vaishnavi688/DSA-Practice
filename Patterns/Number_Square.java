package Patterns;

public class Number_Square {
    public static void number_square(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void same_row_same_number_square(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        number_square(5);
        same_row_same_number_square(5);
    }
}
