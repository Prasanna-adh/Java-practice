import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
        System.out.println("Enter either 1 or 0");
        Scanner sc= new Scanner (System.in);
        int num=sc.nextInt();

        switch(num){
            case 1:
            System.out.println("Enter marks");
            Scanner mar=new Scanner (System.in);
            int marks = mar.nextInt();
            if(marks>=90){
                System.out.println("This is good");
            }
            else if(marks>=60 && marks<=89){
                System.out.println("This is also good");
            }
            else{
                System.out.println("This is good as well");
            }
            case 0:
            break;
        }
    }   
}

