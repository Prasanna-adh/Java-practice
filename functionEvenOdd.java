import java.util.*;

public class functionEvenOdd {
    public static int oddEven(int a){
        if(a%2==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int a=sc.nextInt();

        if(oddEven(a)==1)
        System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
