import java.util.*;

public class functionProduct {
    public static int multiply(int a, int b){
        int pro=a*b;
        return pro;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int pro=multiply(a,b);
        System.out.println("Prodect of two numbers is "+pro);
    }
}
