// //Maximum Sum Among All Rotations
// public class sorttts {
//   static void maxsum(int []arr){
//     int n= arr.length;
//     int arrsum = 0;
//     int currentsum =0;
    
//     for(int i=0;i<n;i++){
//         arrsum +=arr[i];
//         currentsum += i*arr[i];
//     }
//     int maxsum = currentsum;
//     for(int j=1;j<n;j++){
//         currentsum = currentsum + arrsum- n*arr[n-j];
//         if(currentsum > maxsum){
//             maxsum = currentsum;

//         }
//     }
//     System.out.println("maximum sum among all rotation is:"+ maxsum    );


//   }
//   public static void main(String[] args) {
//     int[]arr = {6,4,6,4,5};
//     maxsum(arr);
//   }
// }








        //Count smaller elements on Right side

    // static void countsmaller(int[]arr){
    //     int n = arr.length;
    //     int[]result = new int[n];

    //     for(int i=0;i<n;i++){
    //         int count = 0;
    //         for(int j=i+1;j<n;j++){
    //             if(arr[j]<arr[i]){
    //                 count++;

    //                             }
    //         }
    //         result[i]= count;
    //     }
    //     System.out.println("count of smaller elements on right side:");
    //     for(int i=0;i<n;i++){
    //         System.out.println(result[i]+" ");

    //     }
    // }
    // public static void main(String[] args) {
    //     int[] arr={12,1,2,3,0,11,4};
    //     countsmaller(arr);
    // }
    // }

  










       // Merge sorted arrays with O(1) extra space

//     static void Merge(int[]arr1,int[]arr2,int n,int m){
//         int i=0;
//         int j=0;

//         while(i<n&&j<m){
//             if(arr1[i]<=arr2[j]){
//                 i++;

//             }else{
//                 int value = arr2[j];
//                 int index =j;

//                 while(index>0){
//                     arr2[index]= arr2[index-1];
//                     index--;

//                 }
//                 arr2[0]= arr1[n-1];
//                 arr1[n-1]= value;
                
//                 i++;
//                 j++;


//             }

//         }

//     }
//     public static void main(String[] args) {
//         int[] arr1 ={1,4,7,8,45,23};
//         int[]arr2 ={2,3,4,5};
//         int n = arr1.length;
//         int m=arr2.length;


//         Merge(arr1,arr2,n,m);

//         System.out.println("after mareging the arrays:");
//         System.out.println("first array:");
//         for(int i=0;i<n;i++){
//             System.out.println(arr1[i]+" ");
//         }
//         System.out.println();
//         System.out.println("second array:");
//         for(int j=0;j<m;j++){
//             System.out.println(arr2[j]+" ");

//         }
//     }



    
// }
