import java.util.Scanner;

public class ThreenumAverage {
    public static double findAverage(int a,int b,int c ){
        return(a+b+c)/3.0;

    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter first number:");
    int num1=sc.nextInt();


    System.out.print("Enter second number:");
    int num2=sc.nextInt();


    System.out.print("Enter three number:");
    int num3=sc.nextInt();


    double avg=findAverage(num1, num2, num3);
    System.out.println("Average="+ avg);
}
    
}


//write afuncion that takes in age as input and rturn if that person is eligible to vote or not A person of age>18 is eligible to vote