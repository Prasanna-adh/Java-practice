import java.util.*;

public class array {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int size=sc.nextInt();
        int marks[]=new int[size];

        for(int i=0;i<size;i++){
            Scanner so=new Scanner(System.in);
            marks[i]=so.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
    }
}
