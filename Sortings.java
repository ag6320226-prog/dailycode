
// // public class Sortings {
//     //  for merge sort on doubly 
// // linked list

// class Node {
//     int data;
//     Node next;
//     Node prev;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//         this.prev = null;
//     }
// }
// public class Sortings {


//     static Node split(Node head) {
//         Node fast = head;
//         Node slow = head;

//         while (fast != null && fast.next != null
//                && fast.next.next != null) {
//             fast = fast.next.next;
//             slow = slow.next;
//         }

//         Node temp = slow.next;
//         slow.next = null;
//         if (temp != null) {
//             temp.prev = null;
//         }
//         return temp;
//     }

//     static Node merge(Node first, Node second) {

//         if (first == null)
//             return second;
//         if (second == null)
//             return first;

//         if (first.data < second.data) {

//             first.next = merge(first.next, second);
//             if (first.next != null) {
//                 first.next.prev = first;
//             }
//             first.prev = null;
//             return first;
//         }
//         else {

//             second.next = merge(first, second.next);
//             if (second.next != null) {
//                 second.next.prev = second;
//             }
//             second.prev = null;
//             return second;
//         }
//     }

//     static Node MergeSort(Node head) {
      
//         if (head == null || head.next == null) {
//             return head;
//         }


//         Node second = split(head);


//         head = MergeSort(head);
//         second = MergeSort(second);

//         return merge(head, second);
//     }

//     static void printList(Node head) {
//         Node curr = head;
//         while (curr != null) {
//             System.out.print(curr.data + " ");
//             curr = curr.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {

//         Node head = new Node(10);
//         head.next = new Node(8);
//         head.next.prev = head;
//         head.next.next = new Node(5);
//         head.next.next.prev = head.next;
//         head.next.next.next = new Node(2);
//         head.next.next.next.prev = head.next.next;

//         head = MergeSort(head);

//         printList(head);
//     }
// }


  


    // maximum perimeter

    // static int maxPerimeter(int[] arr){


        
//         int n= arr.length;
//         int ans= -1;

//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 for(int k=j+1;k<n;k++){


//                     if(arr[i] + arr[j] > arr[k] && arr[j] + arr[k] > arr[i] && arr[k] + arr[i] > arr[j]){

//                         ans = Math.max(ans, arr[i]+arr[j]+ arr[k]);

//                     }
//                 }
//             }
//         }
//         return ans;

//     }
//     public static void main(String[] args) {
//         int arr[]= {8,7,5,3,7,2,6,5,9,33,2};
//         System.out.println(maxPerimeter(arr));
//     }
    
// }

