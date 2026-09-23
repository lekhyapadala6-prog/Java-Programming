import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for(int i=0;i<=num;i++){
            System.out.println(num  + "x" + i  + "=" + (num*i));
        }
        sc.close();
    }
}