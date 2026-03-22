package Patterns;

public class Alphanumeric_triangle {
    public static void number_character_pyramid(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
            ch = 'A';
            for(int j=1; j<=i; j++){
                if(i%2==0){
                    System.out.print(ch+" ");
                    ch++;
                }
                else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        number_character_pyramid(10);
    }
}
