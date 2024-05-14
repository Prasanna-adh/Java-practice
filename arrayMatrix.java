import java.util.*;

public class arrayMatrix {
    public static void main(String[] args){
        int[][] number = new int[3][3];
        System.out.println("Enter the numbers");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Scanner sc=new Scanner(System.in);
                number [i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

    }
}
