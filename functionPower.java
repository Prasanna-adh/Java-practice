import java.util.*;

public class functionPower {
    
    public static int power(int x, int n){
        int pow=1;
        for(int i=0;i<n;i++)
        pow=pow*x;
        return pow;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();

        System.out.println("The answer is " +power(x, n));
    }
}
