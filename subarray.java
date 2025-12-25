public class subarray {
       public static void main(String[] args) {
              
       
//        int[] arr={1,2,3,4,5};
//        int n= arr.length;

//        for(int i=0;i<n;i++){
//               for(int j=i;j<n;j++){
//                      for(int k=i;k<=j;k++){
//                             System.out.println(arr[k]+" ");
//                      }
//                      System.out.println();
//               }
//        }
// }
// }
//sum of all subarray
//   int[] arr={1,2,3,4,5};
//        int n= arr.length;
//        int sum=0;

//        for(int i=0;i<n;i++){
//               for(int j=i;j<n;j++){
//                      for(int k=i;k<=j;k++){
//                             sum+=arr[k];
//                      }
//                      System.out.println(sum);
//               }
//        }
// }
// }
//maximum subarray sum

// int[] arr ={-1,2,3,4,-1,9,-5,3,6};
// int n= arr.length;

// int maxsum = Integer.MIN_VALUE;


//  for(int i=0;i<n;i++){
//               for(int j=i;j<n;j++){
//                      int sum=0;
//                      for(int k=i;k<=j;k++){
//                             sum+=arr[k];
//                      }
//                      if(sum>maxsum){
//                             maxsum=sum;

//                      }
//               }
//        }
//        System.out.println("maximum subarray sum is:"+maxsum);
// }
// }
//maximum circular subarray sum

int[] arr ={1,-2,3,4,-1,9,-5,-8,6};
int n= arr.length;

int maxsum = Integer.MIN_VALUE;
int totalsum =0;
for(int i=0;i<n;i++){
       totalsum+= arr[i];
       arr[i]=-arr[i];
}
int currentsum =0;
int minsum =Integer.MAX_VALUE;

for(int i=0;i<n; i++){
       currentsum +=arr[i];
       if(currentsum<minsum){
              minsum = currentsum;

       }
       if(currentsum>0){
              currentsum=0;

       }
}
int circularsum =totalsum + minsum;
if(circularsum>maxsum && circularsum!=0){
       maxsum =circularsum;
}
System.out.println("maximum circular subarray sum is:"+ maxsum);
       }
}




     
        