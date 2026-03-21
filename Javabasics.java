import java.util.*;

public class Javabasics{
    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String Args[]){
        diamond(10);
       /*  hollow_rhombus(10);
        public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
        if(i==1 || i==n){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
        }
        else{
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=1; j++){
                System.out.print("*");
            }
            for(int j=1; j<=n-2; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=1; j++){
                System.out.print("*");
            }
        }
        System.out.println();
        }
        
    }
     /*    solid_rhombus(5);
        public static void solid_rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    /*    butterfly(5);
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    /*triangle_0_1(10);
    public static void triangle_0_1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%2==0){
                    if(j%2==0){
                        System.out.print(1);
                    }
                    else{
                        System.out.print(0);
                    }
                }
                else{
                    if(j%2==0){
                        System.out.print(0);
                    }
                    else{
                        System.out.print(1);
                    }
                }
            }
            System.out.println();
        }
        
    }
        /*public static void floyd_triangle(int n){
        floyd_triangle(10);
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        /*inverted_halfpyramid_number(5);
         public static void inverted_halfpyramid_number(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+ " ");
            }
           
            System.out.println(); 
        }
    }
        /*inverted_rotated_halfpyramid(10);
        public static void inverted_rotated_halfpyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
  /*     hollow_rectangle(4,6);
        public static void hollow_rectangle(int row, int col){
    for(int i=1; i<=row; i++){
        for(int j=1; j<=col; j++){
            if(i==1 || i==row || j==1 || j==col){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
    public static void inverted_half_pyramid(int row, int col){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                
            }
        }

   }
        //Inverted star pattern
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines :");
        int n = sc.nextInt();
        char ch = 'A';
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        //star pattern

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines :");
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.err.println();
        }
        //To check if a no is prime or not 
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no :");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("2 is prime no");
        }
        else{
            boolean isPrime = true;
        for( int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i==0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("It is a prime no");
        }
        else{
            System.out.println("It is not a prime no");
        }
        }
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no :");
        int n = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while(counter <= n){
          sum = sum + counter;
          counter++;  
        }
        System.out.print("The sum is :" + sum);
        System.out.print("Hello World!\n");
        System.out.println("Pattern\n");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        System.out.println("\nAddition of two numbers\n");
        int a = 10;
        int b = 5;
        int sum = 15;
        System.out.println(sum);
        //Input in java next()
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);
        //Input to take with space use nextLine()
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println(name);
        //Input to take number use nextInt()
        Scanner sn = new Scanner(System.in);

        int number = sn.nextInt();
        System.out.println(number);

        float price = sn.nextFloat();
        System.out.println(price);
        //Sum of a and b
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        int a = sc.nextInt();
        System.out.println("Enter Second no");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        //Area of Circle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle :");
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);
        //Type conversion it is allowed
        int a = 25;
        long b = a;
        System.out.println(b);
        //if we swap int and long error occurs
        //Type casting we can forcefully convert a float or long in int even if java doesnt allow
        float a = 43.4555f;
        int b = (int) a;
        System.out.println(b);
        //Type promotion in Java
        char x = 'a';
        char y = 'b';
        System.out.println(y-x);
        System.out.println(x);
        int a = 5;
        float b = 5f;
        long c = 100;
        double d = 100;
        double ans = a+b+c+d;
        System.out.println(ans);
        //Avg of three no 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no:");
        int a = sc.nextInt();
        System.out.println("Enter second no:");
        int b = sc.nextInt();
        System.out.println("Enter third no:");
        int c = sc.nextInt();
        double avg = (a + b + c)/3;
        System.out.println(avg);
        //Area of a square
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square:");
        double s = sc.nextDouble();
        double area = s*s;
        System.out.println(area);
        // finding total cost 
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float cost = pencil + pen + eraser;
        float gst = 0.18f*cost;
        double tcost = cost + gst;
        System.out.println(tcost);
        int $ = 24;
        System.out.print($);
        //Binary Operators
        int A = 10;
        int B = 5;
        System.out.println("Addition :" + (A+B));
        System.out.println("Subtraction : " + (A-B));
        System.out.println("Multiplication :" + (A*B));
        System.out.println("Division :" + (A/B));
        System.out.println("Modulo :" + (A%B));
        
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + " , ");
        System.out.print(exp2);*/
    }
}

