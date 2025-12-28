
// //jump game
// public class ArrayTrappingRainwater {
//     static boolean canjump(int[] arr){
//         int n= arr.length;
//         int maxReach=0;
    
//         for(int i=0;i<n;i++){
//             if(i>maxReach){
//                 return false;

                
//             }
//             maxReach = Math.max(maxReach,i+ arr[i]);

//         }
//         return true;

//     }
//     public static void main(String[] args) {
//         int arr[]= {1,2,4,5,7,7,4,7,4,6,9};
//         System.out.println(canjump(arr));
//     }
//     }






// //maximum circular subarray sum
//     static int maxCircularsum(int[] arr){
//         int n= arr.length;
//         int res = arr[0];

//         for(int i=0;i<n;i++){
//             int currsum=0;

//             for(int j=0;j<n;j++){
//                 int idx = (i+j)% n;
//                 currsum =currsum + arr[idx];
//                 res = Math.max(res,currsum);

//             }
//         }
//         return res;

//     }
//     public static void main(String[] args) {
//         int[] arr ={7,3,82,-5,0,1,6,-7,4,9};
//         System.out.println(maxCircularsum(arr));
//     }

//  }
  
    
    
//  trapping rain water



//    static int maxWater(int[]arr){
//         int res =0;


//         for(int i=1;i<arr.length-1;i++){
//             int left = arr[i];
//             for(int j=0;j<i;j++){
//                 left = Math.max(left,arr[j]);
//             }
//                 int right = arr[i];
//                 for(int k=i+1;k<arr.length;k++){
//                     right = Math.max(right, arr[k]);
//                 }
//                     res +=Math.min(left,right)- arr[i];


//                 }
//                 return res;
//             }
//             public static void main(String[] args){
//                 int[] arr = {2,3,4,1,5,7,3,1};
//                 System.out.println(maxWater(arr));
//             }


            
        
    


