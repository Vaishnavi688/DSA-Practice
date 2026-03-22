package Patterns;

public class Character {
    public static void character(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
            ch = 'A';
            for(int j=1; j<=n; j++){
                System.out.print(ch+ " ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void small_character(int n){
        char ch = 'a';
        for(int i=1; i<=n; i++){
            ch = 'a';
            for(int j=1; j<=n; j++){
                System.out.print(ch+ " ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void same_row_same_character(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(ch+ " ");
            }
            ch++;
            System.out.println();
        }
    }
    public static void alternate_small_capital_character(int n){
        for(int i=0; i<n; i++){
        char ch = (char)('a' + i);  
        
        for(int j=1; j<=n; j++){
            if(i%2==0){
                // even rows = small
                System.out.print(ch + " ");
            } else {
                // odd rows = capital
                System.out.print((char)(ch - 32)+ " "); // convert to capital
            }
        }
        System.out.println(); 
    }
    }
    public static void main(String Args[]){
        character(10);
        small_character(10);
        same_row_same_character(10);
        alternate_small_capital_character(10);
    }
}
