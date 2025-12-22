// import java.util.*;
// public class stackk {

// //   static  class stack{
// //       static  ArrayList<Integer>list = new ArrayList();
// //         public static boolean isEmpty(){
// //             return list.size()==0;
// //         }
// //         //push
// //         public static void push(int data){
// //             list.add(data);
// //         }
// //         // pop

// //         public static int pop(){
// //             if(isEmpty()){
// //                 return -1;
// //             }
// //             int top =list.get(list.size()-1);
// //             list.remove(list.size()-1);
// //             return top;
// //         }
// //         public static int peek(){
// //             if(isEmpty()){
// //                 return -1;
// //             }
// //             return list.get(list.size()-1);
// //         }
// //     }

// //     // static class node{
// //     //     int data;
// //     //     node next;
// //     //     public node(int data){
// //     //         this.data= data;
// //     //         next = null;

// //     //     }

// //     // }
// //     // static class stack{
// //     //     public static node head;
// //     //     public static boolean isEmpty(){
// //     //         return head == null;
// //     //     }
// //     //     public static void push (int data){

// //     //       node newNode= new node(data);
// //     //       if(isEmpty()){
// //     //         head = newNode;
// //     //         return;
// //     //       }
// //     //         newNode.next = head;
// //     //         head = newNode;
// //     //     }
// //     //      public static int pop(){
// //     //         if(isEmpty()){
// //     //             return -1;
// //     //         }
// //     //         int top = head.data;
// //     //         head= head.next;
// //     //         return top;
// //     //      }
// //     //      public static int peek(){
// //     //         if(isEmpty()){
// //     //             return -1;
// //     //         }
// //     //         return head.data;
// //     //      }
// //     // }
// //     public static void main(String[] args) {
// //         stack s= new stack();
// //         s.push(1);
// //         s.push(2);
// //           s.push(3);
// //         s.push(4);
// //           s.push(5);
// //         s.push(7);

// //         while (!s.isEmpty()) {
// //             System.out.println(s.peek());
// //             s.pop();
            
// //         }
// //     }

    
// // }


// // public static void pushBottom(int data,Stack<Integer> s){
// //     if(s.isEmpty()){
// //         s.push(data);
// //         return;
// //     }

// //     int top = s.pop();
// //     pushBottom(data, s);
// //     s.push(top);

// // }
// // public static void main(String[] args) {
// //      Stack<Integer> s= new Stack<>();

// //      s.push(2);
     
// //      s.push(5);
     
// //      s.push(3);
     
// //      s.push(1);

// //      pushBottom(4, s);
// //      while(!s.isEmpty()){
// //         System.out.println(s.peek());
// //         s.pop();
// //      }
// // }
// // }
// //reverse a string 

// public static void pushBottom(int data,Stack<Integer> s){
//     if(s.isEmpty()){
//         s.push(data);
//         return;
//     }

//     int top = s.pop();
//     pushBottom(data, s);
//     s.push(top);

// }
// public static void reverse(Stack<Integer>s){
//     if(s.isEmpty()){
//         return;
//     }
//     int top = s. pop();
//     reverse(s);
//     pushBottom(top, s);
// }
// public static void main(String[] args) {
//      Stack<Integer> s= new Stack<>();

//      s.push(1);
     
//      s.push(2);
     
//      s.push(3);
     
//      s.push(4);

// reverse(s);
//      while(!s.isEmpty()){
//         System.out.println(s.peek());
//         s.pop();
//      }
// }
// }