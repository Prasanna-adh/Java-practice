import java.util.*;

public class functionGreatestDivisor {
    public static int greatestDivisor(int a, int b){
        for(int i=a;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return -1;
    }  
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=greatestDivisor(a,b);
        if(ans==-1){
        System.out.println("No common divisor found");
        }else{
        System.out.println("Greatest common divisor is "+ans);
        }
    }  
}
