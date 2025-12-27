


// public class arrPartion{
    
       


//  public static void main(String[] args){
        
   
//         int[] arr = {9,2,8,5,2,90,57,53};
//         int pivot =10;
//         int[] partitionedArr =partitionArray(arr,pivot);

//         for(int num : partitionedArr){
//             System.out.print(num +" ");
//         }

//     }
               
//                       public static int[] partitionArray(int[]arr,int pivot){


        
//             int[]result = new int[arr.length];
//             int left =0;
//             int right = arr.length-1;


//             for(int num :arr){
//                 if(num<pivot){
//                     result[left++]= num;

//                             }else{
//                                 result[right--]= num;


//                             }
//         }
//         while(left <= right){
//             result[left++]= pivot;
//         }
//         return result;
//     }

// }

// Rotate arr
// public static void main(String[] args) {
//     int[] arr ={2,5,3,8,1,9,3,4,6,4};
//     int k=4;
//     int[] rotateArr = rotateArray(arr,k);
//         for(int num : rotateArr){
//             System.out.println(num +" ");
//         }
//     }

//     public static int[]  rotateArray(int[]arr,int k){
//         int n= arr.length;
        
//         k=k%n;
//         reverse(arr,0,n-1);
//       reverse(arr,0,k-1);
//               reverse(arr,k,n-1);
//               return arr;



//     }
    
//     public static void reverse(int[]arr,int start,int end){
//         while(start<end){
//             int temp = arr[start];
//             arr[start]= arr[end];
//             arr[end]= temp;
//             start++;
//             end--;
//         }

// // }
// // }
// // array leader
//  public static void main(String[] args) {
//     int[] arr ={16,14,2,4,8,3,5};
//     printLeaders(arr);
//  }
//  public static void printLeaders(int[] arr){
//     int n = arr.length;
//     int maxFromright = arr[n-1];
//     System.out.print(maxFromright +" ");
    
//     for(int i= n-2;i>=0;i--){
//         if(arr[i]> maxFromright){
//             maxFromright =arr[i];
//         System.out.println(maxFromright + "");
//         }
//     }
//  }
// }




