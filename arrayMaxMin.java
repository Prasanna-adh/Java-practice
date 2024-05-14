import java.util.*;

public class arrayMaxMin {
    public static void main(String [] args){
        System.out.println("Enter how many numbers");;
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[10];
        System.out.println("Enter the numbers");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Maximum number is " + arr[0]);
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Minimum number is " + arr[0]);
}
}
