// import java.util.*;

// public class AlgoBinaryTree {
//     static class node {
//         String data;
//         node left;
//         node right;

//         node(String data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     public static int precedence(String ch) {
//         switch (ch) {
//             case "+":
//             case "-":
//                 return 1;
//             case "*":
//             case "/":
//                 return 2;
//             case "^":
//                 return 3;
//         }
//         return -1; 
//     }
//     public static boolean isOperator(String ch) {
//         return ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/") || ch.equals("^");
//     }

//     public static String infixToPostfix(String infix) {
//         List<String> tokens = tokenize(infix);
//         StringBuilder postfix = new StringBuilder();
//         Stack<String> stack = new Stack<>();

//         for (String token : tokens) {
//             if (!isOperator(token) && !token.equals("(") && !token.equals(")")) {
                
//                 postfix.append(token).append(" ");
//             } else if (token.equals("(")) {
//                 stack.push(token);
//             } else if (token.equals(")")) {
               
//                 while (!stack.isEmpty() && !stack.peek().equals("(")) {
//                     postfix.append(stack.pop()).append(" ");
//                 }
//                 stack.pop(); 
//                 while (!stack.isEmpty() && precedence(token) <= precedence(stack.peek())) {
//                     postfix.append(stack.pop()).append(" ");
//                 }
//                 stack.push(token); 
//             }
//         }
//         while (!stack.isEmpty()) {
//             postfix.append(stack.pop()).append(" ");
//         }

//         return postfix.toString().trim();
//     }
//     private static List<String> tokenize(String s) {
//         List<String> tokens = new ArrayList<>();
//         StringBuilder currentToken = new StringBuilder();
//         for (char c : s.toCharArray()) {
//             if (Character.isDigit(c) || c == '.') {
//                 currentToken.append(c);
//             } else {
//                 if (currentToken.length() > 0) {
//                     tokens.add(currentToken.toString());
//                     currentToken.setLength(0);
//                 }
//                 if (!Character.isWhitespace(c)) {
//                     tokens.add(String.valueOf(c));
//                 }
//             }
//         }
//         if (currentToken.length() > 0) {
//             tokens.add(currentToken.toString());
//         }
//         return tokens;
//     }
//     public static node buildExpressionTree(String postfix) {
//         Stack<node> st = new Stack<>();
//         String[] tokens = postfix.split("\\s+");

//         for (String token : tokens) {
//             if (!isOperator(token)) {
            
//                 st.push(new node(token));
//             } else {
//                 node op2 = st.pop();
//                 node op1 = st.pop();
//                 node operatorNode = new node(token);
//                 operatorNode.left = op1;
//                 operatorNode.right = op2;
//                 st.push(operatorNode);
//             }
//         }
//         return st.pop();
//     }
//     public static void inorderTraversal(node root) {
//         if (root == null) return;
//         boolean isOperatorNode = isOperator(root.data);
//         if (isOperatorNode && root.left != null && isOperator(root.left.data)) System.out.print("(");
//         inorderTraversal(root.left);
//         if (isOperatorNode && root.left != null && isOperator(root.left.data)) System.out.print(")");

//         System.out.print(root.data + " ");

//         if (isOperatorNode && root.right != null && isOperator(root.right.data)) System.out.print("(");
//         inorderTraversal(root.right);
//         if (isOperatorNode && root.right != null && isOperator(root.right.data)) System.out.print(")");
//     }

//     public static void main(String[] args) {
//         String infixExpression = " (3+2-5*6/(9^4*7)/8)";
//         System.out.println("Original Infix: " + infixExpression);

//         String postfixExpression = infixToPostfix(infixExpression);
//         System.out.println("Postfix Form:   " + postfixExpression);

//         node root = buildExpressionTree(postfixExpression);
//         System.out.print("Inorder Traversal: ");
//         inorderTraversal(root);
//         System.out.println();
//     }
// }

