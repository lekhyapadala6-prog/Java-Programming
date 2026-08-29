import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        double num1=sc.nextDouble();
        System.out.println("Enter Second number:");
        double num2=sc.nextDouble();
        System.out.println("Enter Operator(+,-,*,/):");
        char operator=sc.next().charAt(0);
        if(operator=='+'){
            System.out.println("Result="+(num1+num2));
        }
        else if(operator=='-'){
            System.out.println("Result="+(num1-num2));
        }
        else if(operator=='*'){
            System.out.println("Result="+(num1*num2));
        }
    else if(operator=='/'){
        if(num2 !=0){
            System.out.println("Result="+(num1/num2));
        }else{
            System.out.println("Cannot divided by zero");
        }
    }
    else{
        System.out.println("Invalid Character");
    }
}
}

