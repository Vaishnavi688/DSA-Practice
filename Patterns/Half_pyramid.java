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
    public static void same_row_same_number_half_pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i );
            }
            System.out.println();
        }
    }
    public static void character_half_pyramid(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
            ch = 'A';
            for(int j=1; j<=i; j++){
                System.out.print(ch );
                ch++;
            }
            System.out.println();
        }
    }
    public static void same_row_same_character_half_pyramid(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch );
            }
            ch++;
            System.out.println();
        }
    }
    public static void alternate_small_capital_character(int n){
        for(int i=1; i<=n; i++){
        char ch = (char)('a'+(i-1));  
        
        for(int j=1; j<=i; j++){
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
        half_pyramid(5);
        same_row_same_number_half_pyramid(5);
        character_half_pyramid(5);
        same_row_same_character_half_pyramid(5);
        alternate_small_capital_character(5);
    }
}
