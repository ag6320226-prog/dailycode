//    //Two stacks in an array
   


    
// // public class Stackarr {

// //     int[] arr;
// //     int top1,top2;

// //     public Stackarr(int size){
// //         arr = new int[size];
// //         top1 =-1;
// //         top2 =size;

// //     }
// //     public void push1(int value){
// //         if(top1 +1 <top2){
// //             arr[++top1]= value;

// //         }else{
// //             System.out.println("Stack 1 overflow");
// //         }
// //     }
// //     public void push2(int value){
// //         if(top2 -1>top1){
// //             arr[--top2]= value;
// //         }else{
            
// //             System.out.println("Stack 2 overflow");
// //         }
// //     }
// //     public int pop1(){
// //         if(top1>=0){
// //             return arr[top1--];
// //         }else{
// //             System.out.println("stack 1 underflow");
// //             return -1;
// //         }
// //     }
// //     public int pop2(){
// //         if(top2 <arr.length)
// //     {
// //         return arr[top2++];
// // }else{
// //     System.out.println("stack 2 underflow");
// //     return -1;
// // }



 
    
// // }
// // public static void main(String[] args) {
// //     Stackarr s= new Stackarr(10);
// //  s.push1(1);
// //  s.push1(2);
// // s. push1(3);
// // s.push2(10);
// // s.push2(9);
// // s.push2(8);
// // System.out.println(s.pop1());
// // System.out.println(s.pop2());


    
// // }

    
// // }

// // delete middle element from stack
// public class Stackarr {
//     int[] arr;
//     int top;
//     int size;

//     public Stackarr(int size){
//         arr =new int[size];
//         top =-1;
//         this. size = size;

//     }
//     public  void push(int value){
//         if(top < size-1){
//             arr[++top] = value;

//         }else{
//             System.out.println("stack overflow");

//         }
//     }
//     public int pop(){
//         if(top>=0){
//             return arr[top--];

//         }else{
//             System.out.println("stack underflow");
//             return -1;
//         }
//     }
//     // public void deletemiddle(){
//     //     if(top==-1){
//     //         System.out.println("stack is empty");
//     //         return;
//     //     }
//     //     int mid = top/2;
//     //    deletemiddle();
    
    
//     // }
//     public void printstack(){
//         for(int i=0;i<=top;i++){
//             System.out.println(arr[i] + " ");
//         }
//         System.out.println();
//     }
//      public void deletemiddle(){
//         if(top==-1){
//             System.out.println("stack is empty");
//             return;
//         }
//     deletemiddle(top/2);
        
//     }
//     private void deletemiddle(int mid){
//         if(mid==0){
//             pop();
//             return;
//         }
//         int temp=pop();
//         deletemiddle(mid-1);
//         push(temp);
//     }
   
    
    
    
//     public static void main(String[] args) {
//          Stackarr s= new Stackarr(10);
//           s.push(1);
//  s.push(2);
// s. push(3);
//  s.push(4);
// s. push(5);
//  s.push(6);
// s. push(7);

// System.out.println("original stack:");
// s.printstack();
// s.deletemiddle();
// System.out.println("stsck after deleting middle element:");
// s.printstack();

//     }
// }









