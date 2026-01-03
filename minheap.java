// public class minheap {
//          static void heapify(int[] arr,int n,int i){
//         int Smallest =i;
//         int l=2* i +1;
//         int r =2* i+2;

//         if(l<n && arr[l]> arr[Smallest])
//             Smallest =l;
//         if(r<n && arr[r] > arr[Smallest])
//            Smallest = r;

//         if(Smallest != i){
//             int temp = arr[i];
//             arr[i] =arr[Smallest];
//             arr[Smallest] = temp;

//             heapify(arr, n, Smallest);

//         }
//     }
//     static void heapSort(int[] arr){
//         int n= arr.length;
//         for(int i=n/2-1;i>= 0;i--)
//             heapify(arr, n, i);

//         for(int i=n-1;i>0;i--){
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i]=temp;

//             heapify(arr, i, 0);
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {11,29,31,2,97,94,84,52,81,47,78,81};
//         heapSort(arr);
//         for(int i=0;i<arr.length;++i){
//             System.out.println(arr[i] + " ");
//         }
//     }


    
// }


    

