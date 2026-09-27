import java.util.Scanner;
public class PrimeRange{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Starting Number:");
        int start=sc.nextInt();
        System.out.println("Enter Ending Number:");
        int end=sc.nextInt();
        for(int num=start;num<=end;num++){
            boolean isPrime=true;
            if(num<2){
                isPrime=false;
            }
            else{
                for(int i=2;i*i<=num;i++){
                    if(num%i==0){
                        isPrime=false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.println(num);
            }
        }
        sc.close();
    }
}