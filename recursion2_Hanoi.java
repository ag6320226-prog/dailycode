public class recursion2_Hanoi {
//     public static void towerOfHanoi(int n,String src,String helper,String dest){
//         if(n==1){
//             System.out.println("transfer disk"+ n+ "from"+ src+"to"+dest);
//             return;
//         }
//         towerOfHanoi(n-1, src, helper, dest);
//         System.out.println("transfer disk"+ n+ "from"+ src+"to"+dest);
//         towerOfHanoi(n-1, src, helper, dest);
//     }
//     public static void main(String[] args) {
//         int n=7
// ;
// towerOfHanoi(n, "s","h","d");
//     }
// }
//print a string in reverse
//  public static void printRev(String str,int idx){
//     if(idx==0){
//         System.out.println(str.charAt(idx));

//         return ;

//     }
//     System.out.print(str.charAt(idx));
//     printRev(str, idx-1);
//  }
//  public static void main(String[] args) {
//     String str= "abscfdhedg";
// printRev(str,str.length()-1);
//  }
// }
// first and last occurance of an element in string

// public static int first=-1;
// public static int last=-1;

// public static void findOcc(String str,int idx,char element){
//     if(idx== str.length()){
//         System.out.println(first);
//          System.out.println(last);
//          return;
//     }
//     char currChar= str.charAt(idx);
//     if(currChar==element){
//     if(first==-1){
//         first = idx;
//     }else{
//         last=idx;
//     }
// }
//   findOcc(str, idx+1, element);
// }
// public static void main(String[] args) {
//     String str = "abcdfsgaad";
//     findOcc(str, 0, 'a');
// }
// }




// public static boolean isSorted(int arr[],int idx){
//     if(idx == arr.length-1){
//         return true;
//     }
//     if(arr[idx]< arr[idx+1]){
//         //srray is sorted till now
//         return isSorted(arr, idx+1);

//     }else{
//         return false;
//     }
// }
// public static void main(String[] args) {
//     int arr[]={3,4,5,6,7,4,5,53,4,};
//     System.out.println(isSorted(arr, 0));
// }

// }
// // move all x tothe end of the string
// public static void moveAllx(String str,int idx,int count,String newString){
//     if(idx==  str.length()){
//         System.out.println(newString);
//         return;
//     }
//     char currChar =str.charAt(idx);
//     if(currChar=='c'){
      
//         count++;
//         moveAllx(str, idx+1, count, newString);
//     }else{
//         newString +=currChar;
//         moveAllx(str, idx+1, count, newString);
   
//     }
// }

// public static void main(String[] args) {
//     String str ="axcsddh";
//     moveAllx(str, 0, 0, "");
// }


// }




