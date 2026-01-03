import java.util.Scanner;
public class SimpleIntrest{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Principal value: ");
double principal = sc.nextDouble();
System.out.println("Enter Rate of Interest value: ");
double rate = sc.nextDouble();
System.out.print("Enter Time period: ");
double time = sc.nextDouble();
double simpleInterest = (principal * rate * time) / 100;
System.out.println("Simple Interest = " + simpleInterest);
double amount = principal + simpleInterest;
System.out.println("Total Amount = " + amount);
}
}
