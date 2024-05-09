import java.util.*;

public class arrayQn {
    public static void main(String [] args){
        Scanner so=new Scanner(System.in);
        int size=so.nextInt();
        int num[]=new int[10];

        for(int i=0;i<size;i++){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number");
            num[i]=sc.nextInt();
        }

        System.out.println("The number to find is:");
        int x=so.nextInt();

        for(int i=0;i<size;i++){
            if(num[i]==5)
            System.out.println(num[i]);
        }
    }
}
