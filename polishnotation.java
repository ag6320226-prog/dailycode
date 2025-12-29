// import java.util.*;

// public class polishnotation {
//     //infix to prefix
//     //check operator precedence
//     static int precedence(char ch){
//         switch (ch){
//             case '+':
//                  case '-':
//                     return 1;
//                      case '*': case '/':
//           return 2;

//         }
//         return -1;
//     }
//     //fnc to convert infix to prefix
//     static String polishnotation(String exp){
//         //step1:reverse the expression

//         StringBuilder reversed = new StringBuilder(exp).reverse();
//         char[]arr = reversed.toString().toCharArray();
//         //step 2:swap brackets
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]=='(')arr[i] =')';
//             else if(arr[i]==')')arr[i]='(';

//         }
//         //step 3:convert reversed to postfix
//         Stack<Character> stack= new Stack<>();
//         StringBuilder postfix = new StringBuilder();
//         for(char c:arr){
//             if(Character.isLetterOrDigit(c)){
//                 postfix.append(c);

//             }
//             else if(c=='('){
//                 stack .push(c);
//             }
//             else if(c==')'){
//                 while (!stack.isEmpty()&& stack.peek()!='(') {
//                     postfix.append(stack.pop());

                    
//                 }
//                 stack.pop();
//             }
//             else{
//                 while(!stack.isEmpty()&& precedence(c)<= precedence(stack.peek())){
//                     postfix.append(stack.pop());


//                 }
//                 stack.push(c);

//             }
//         }
//         while(!stack.isEmpty()){
//             postfix.append(stack.pop());
//         }
//         // return postfix.reverse().toString();
//                  return postfix.toString();
//     }
// public static void main(String [] args)
// {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter infix expression:");
//     String exp=sc.nextLine();

//     String prefix = polishnotation(exp);
//     System.out.println("prefix"+ prefix);
    
//     // String postfix = polishnotation(exp);
//     // System.out.println("postfix"+ postfix);
    

// }
//     } 
    

