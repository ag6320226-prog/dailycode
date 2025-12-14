
// import java.util.Scanner;
// import java.lang.Math; // Math class is imported by default
// public class scintificcalculator {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int operation;
//         double num1, num2, result;

//         while (true) {
//             // Display menu for operations
//             System.out.println("====== Scientific Calculator Menu ======");
//             System.out.println("selection an operation:");
     
//             System.out.println("1. Addition (+)");
//             System.out.println("2. Square Root (sqrt)");
//             System.out.println("3. Sine (sin)");
//             System.out.println("0. Exit");
//             System.out.print("Choose operation (0-3): ");
            
//             if (scanner.hasNextInt()) {
//                 operation = scanner.nextInt();
//             } else {
//                 System.out.println("Invalid input. Please enter a number.");
//                 scanner.next(); // Clear invalid input
//                 continue;
//             }

//             if (operation == 0) {
//                 System.out.println("Exiting calculator. Thank you!");
//                 break;
//             }

//             switch (operation) {
//                 case 1:
//                     System.out.print("Enter two numbers: ");
//                     num1 = scanner.nextDouble();
//                     num2 = scanner.nextDouble();
//                     result = num1 + num2;
//                     System.out.println("Result: " + result);
//                     break;
//                 case 2:
//                     System.out.print("Enter a number: ");
//                     num1 = scanner.nextDouble();
//                     result = Math.sqrt(num1);
//                     System.out.println("Result: " + result);
//                     break;
//                 case 3:
//                     System.out.print("Enter angle in radians: ");
//                     num1 = scanner.nextDouble();
//                     result = Math.sin(num1);
//                     System.out.println("Result: " + result);
//                     break;
//                 default:
//                     System.out.println("Invalid operation choice.");
//             }
//             System.out.println();
//         }
       
//     }
// }


    

