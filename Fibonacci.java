import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<num;i++){
            System.out.println( a + " ");
            int c=a+b;
            a=b;
            b=c;
        }
        //static int fibonacci(int num){
          //  if(num<=1)
            //    return num;
            //return fibonacci(num-1)+fibonacci(num-2);
            //}
        sc.close();
        }
}
