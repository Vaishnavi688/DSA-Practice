package Patterns;

public class Rectangle_Square {
    public static void rectangle(int row, int col){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void square(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        rectangle(5,8 );
        square(5);
    }
}
