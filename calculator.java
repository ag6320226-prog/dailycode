import java.util.Scanner;

public class calculator {
    int add(int a,int b){
        return a+b;

    }
    int sub(int a,int b){
        return a-b;

    }
    int mul(int a,int b){
        return a*b;

    }
    int div(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        calculator calc=new calculator();
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        System.out.println("Addition: "+ calc.add(num1,num2));
            System.out.println("substraction: "+ calc.sub(num1,num2));
                
            System.out.println("multiplication: "+ calc.mul(num1,num2));
            
            System.out.println("division: "+ calc.div(num1,num2));
            sc.close();





        }

    }


    

