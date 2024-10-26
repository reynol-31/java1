import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int sum=num1+num2;
    int diff=num1-num2;
    int prod=num1*num2;
    double div1=(double)num1/num2;
    int div2=num1/num2;
    int rem=num1%num2;
    double exp=Math.pow(num1,num2);
    System.out.println("sum="+sum);
    System.out.println("difference="+diff);
    System.out.println("product="+prod);
    System.out.println("decimal value division="+div1);
    System.out.println("quotient="+div2);
    System.out.println("remainder="+rem);
    System.out.println("exponent="+exp);
}}
