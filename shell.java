// public class shell {
//     int shell_sort(int my_arr[]){
//         int arr_len = my_arr.length;
//         for(int gap = arr_len/2; gap>0;
//             gap /= 2){
//                 for(int i = gap;i<arr_len;i += 1){
//                     int temp = my_arr[i];
//                     int j;
//                     for(j=i;j>= gap && my_arr[j-gap]>temp; j -= gap)
//                         my_arr[j] = my_arr[j-gap];
//                     my_arr[j] = temp;

//                 }
//             }
//             return 0;

//     }
//     public static void main(String[] args) {
//         int my_arr[] ={23,5,26,3,7,3,13,38,2,1};
//        shell my_instance = new shell();
//         my_instance.shell_sort(my_arr);
//         System.out.println("the arr,after performing shell sort is:");
//         int arr_len = my_arr.length;
//         for(int i = 0;i<arr_len;++i){
//             System.out.println(my_arr[i] + " ");
//             System.out.println();
//         }
//     }
    
// }
