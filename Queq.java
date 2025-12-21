//implementation 1
// public class Queq{
//     static class Queue{ // class
//         static int arr[];   // dusre function mein access kar sake
//         static int size;    //store size
//         static int rear = -1;
//         Queue(int n){
//             arr = new int[n];
//             this.size= n;
//         }
//         public static boolean isEmpty(){
//             return rear ==-1;
//         }
//         //enqueue
//         public static void add(int data){
//             if(rear == size-1){
//                 System.out.println("full queu");
//                 return ;

//             }
//             rear++;   //increment
//             arr[rear]= data;

//         }

//         //dequeu   0(n)
//      public static int remove(){
//         if( isEmpty()){
//             System.out.println("empty queu");
//             return -1;
//         }
//         int front = arr[0];
//         for(int i=0;i<rear;i++){
//             arr[i]= arr[i+1];
//         }
//         rear--;
//         return front;
//      }

//      //peek
//        public static int peek(){
//            if( isEmpty()){
//             System.out.println("empty queu");
//             return -1;
//         }
//         return arr[0];
        
//        }
//     }

//     public static void main(String[] args) {
//         Queue q= new Queue(5);
//         q.add(1);
//          q.add(2);
//           q.add(3);


//                while (!q.isEmpty()) {
//                 System.out.println(q.peek());
//                 q.remove();
                
//                }

//     }
    
// }
   // for circular queue implementation usiing array


// public class Queq{
//     static class Queue{ // class
//         static int arr[];   // dusre function mein access kar sake
//         static int size;    //store size
//         static int rear = -1;
//    static int front= -1;
//         Queue(int n){
//             arr = new int[n];
//             this.size= n;
//         }
//         public static boolean isEmpty(){
//             return rear  ==-1 && front ==-1;
//         }
//         public static boolean isFull(){
//             return( rear +1) % size == front;
//         }
//         //enqueue
//         public static void add(int data){
//             if(isFull()){
        
            
//                 System.out.println("full queu");
//                 return ;

//             }
//             // first element add
//             if(front ==-1){
//                 front =0;
//             }
//             rear = (rear+1)%size;//increment
//             arr[rear]= data;

//         }

//         //dequeu   0(1)
//      public static int remove(){
//         if( isEmpty()){
//             System.out.println("empty queu");
//             return -1;
//         }

//         //singl ele condition
//         int result = arr[front];
//         if(rear == front){
//             rear = front =-1;
//         }else{
//             front = (front+1)%size;
//         }
//         return result;
            
//         }
        
     

//      //peek
//        public static int peek(){
//            if( isEmpty()){
//             System.out.println("empty queu");
//             return -1;
//         }
//         return arr[front];
        
//        }
//     }

//     public static void main(String[] args) {
//         Queue q= new Queue(5);
//         q.add(1);
//          q.add(2);
//           q.add(3);
//              q.add(4);
//           q.add(5);
//           System.out.println(q.remove());
//           q.add(6);
//           System.out.println(q.remove());
//           q.add(7);


//                while (!q.isEmpty()) {
//                 System.out.println(q.peek());
//                 q.remove();
                
//                }

//     }
    
// }


//linkedlist implementation


// public class Queq{
//   static  class node{
//         int data;
//         node next;

//         node(int data){
//             this.data= data;
//             next=null;
//         }

//     }
//     static class Queue{ // class
//        static node head=null;
//        static node tail= null;
        
        
//         public static boolean isEmpty(){
//             return head  ==null & tail ==null;
//         }
        
//         //enqueue
//         public static void add(int data){
//           node newnode = new node(data);
//           if(tail == null){
//             tail = head = newnode;
//             return;
//           }
//             tail.next = newnode;
//             tail = newnode;
          
//             }
         

//         //dequeu   0(1)
//      public static int remove(){
//         if( isEmpty()){
//             System.out.println("empty queu");
//             return -1;
//         }

//     int front = head.data;
//     if(head == tail){
//         tail = null;
//     }
//     head = head.next;

//     return front;
//         }
        
     

//      //peek
//        public static int peek(){
//            if( isEmpty()){
//             System.out.println("empty queu");
//             return -1;
//         }
//         return head.data;

        
//        }
//     }

//     public static void main(String[] args) {
//         Queue q= new Queue();
//         q.add(1);
//          q.add(2);
//           q.add(3);
//            q.add(4);
//             q.add(5);
//              q.add(6);
      


//                while (!q.isEmpty()) {
//                 System.out.println(q.peek());
//                 q.remove();
                
//                }

//     }
    
// }


// collection framework

// import java.util.*;

// public class Queq{
//    public static void main(String[] args) {
//       // Queue<Integer>q = new LinkedList<>();
//         Queue<Integer>q = new ArrayDeque<>();
//          q.add(1);
//          q.add(2);
//           q.add(3);
//            q.add(4);
//             q.add(5);
//              q.add(6);
      


//                while (!q.isEmpty()) {
//                 System.out.println(q.peek());
//                 q.remove();

//    }
// }
// }