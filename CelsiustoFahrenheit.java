import java.util.Scanner;
public class CelsiustoFahrenheit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in Celsius ");
        double Celsius=sc.nextDouble();
        double Fahrenheit=(Celsius*9/5)+32;
        System.out.println("Temperature in Fahrenheit"+Fahrenheit);
        System.out.println("Enter temperature in fahrenheit ");
        double fahrenheit=sc.nextDouble();
        double celsius=(fahrenheit-32)*5 / 9;
        System.out.println("Temperature in celsius"+celsius);
        sc.close();
    }
}