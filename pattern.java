import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        int n=1;
        for(int i=0;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=6;j>=1;j=j-2){
                for(int k=1;k<j;k++){
                    System.out.print(" "); 
                    System.out.print("*");
                }  
            }
            System.out.println();
        }      
    }
}   