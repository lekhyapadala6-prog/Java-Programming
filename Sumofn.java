import java.util.Scanner;
public class Sumofn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        double num=sc.nextDouble();
        double sum = num*(num+1)/2;
        System.out.println("Sum of n numbers:"  +  sum);
        sc.close();
    }
}