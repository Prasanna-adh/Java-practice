import java.util.Scanner;

public class main{

    public static void main(String[] args){
        System.out.println("Enter either 1 or 0");
        Scanner sc= new Scanner (System.in);
        int number=sc.nextInt();

        switch(number){
            case 1:
            System.out.println("Enter marks");
            Scanner mar=new Scanner (System.in);
            int num = mar.nextInt();
            if(num>=90){
                System.out.println("This is good");
            }
            else if(num>=60 && num<=89){
                System.out.println("This is also good");
            }
            else{
                System.out.println("This is good as well");
            }
            case 0:
            break;
            }
        }
    
    public static void infinite_loop(String[] args){
        for(;;)
        System.out.println("Prasanna Adhikari");
    }
    public static void even(String[] args){
        System.out.println("Enter nth number");
        Scanner sc= new Scanner (System.in);
        int num=sc.nextInt();
        
        for(int i=1;i<=num;i++){
            if(i%2==0)
            System.out.println(i);
        }
    }
    public static void tbale(String[] args){
        System.out.println("Enter your choice");
        Scanner sc = new Scanner (System.in);
        int num= sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }

    public static void sum(String[] args){
        System.out.println("Enter nth number");
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("Sum of " +n+ " number is " + sum);
    }
    public static void loop(String[] args){
        for(int i=0;i<100;i++){
            System.out.println("Hello World");
        }
    }
    public static void calender(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch(n){
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("Februarary");
            break;
            case 3: System.out.println("March");
            break;
            default: System.out.println("Invalid choice");
        }
    }
    public static void calculator(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Scanner s0 = new Scanner(System.in);
        int ch = s0.nextInt();
        switch(ch){
            case 1: System.out.println(a=b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            break;
            case 5: System.out.println(a%b);
            break;
            default: System.out.println("Invalid choice");
        }
    }
}