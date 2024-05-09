import java.util.*;

public class functionPrime {
    public static int primeComposit(int n){
        if(n!=0){
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return 0;
                }
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        if(primeComposit(n)==1){
            System.out.println("prime");
        }
        else{
            System.out.println("composit");
        }
    }
}
