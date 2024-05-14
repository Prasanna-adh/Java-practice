import java.util.*;

public class array2dIndices {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[rows][col];

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter number to search");
        int num=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==num){
                    System.out.println("Index of "+num+" is "+i+" "+j);
                }
            }
        }

    }
}
