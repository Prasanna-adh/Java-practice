public class fabrionic {
    public static void main(String[] args){
        int a=0;
        int b=1;
        int c=1;
        System.out.print("0 ");
        for(int i=0;i<=10;i++){
            System.out.print(c+" " );
                c=a+b;
                a=b;
                b=c;
        }
    }
}
