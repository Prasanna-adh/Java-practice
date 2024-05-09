import java.util.Scanner;

public class primecomposit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth number");
        int num=sc.nextInt();

        if(num!=0){
            for(int i=2;i<num;i++){
                if(num%i==0){
                    System.out.println("composite");
                    break;
                }
                else{
                    System.out.println("prime");
                    break;
                }
            }
        }else{
            System.out.println("Invalid input");
        }
        }
    
}
