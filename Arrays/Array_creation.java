package Arrays;
import java.util.*;
// dataType arrayName[] = new dataType[size];
public class Array_creation {
    public static void update(int mark[]){
        for(int i=0; i<mark.length; i++){
            mark[i] = mark[i] + 1;
        }
    }
    public static void main(String[] args) {
    int marks[] = new int[50];
    Scanner sc = new Scanner(System.in);
    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();
    System.out.println("physics:" +marks[0]);
    System.out.println("Chem:" +marks[1]);
    System.out.println("Maths:" +marks[2]);

    int mark[] = {98, 80, 95};
    update(mark);
    //print marks
    for(int i=0; i<mark.length; i++){
        System.out.print(mark[i]+" ");
    }
    }
    
}