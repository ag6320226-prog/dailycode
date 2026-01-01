// public class selectionsort{
//     void sort(int a[]){
//         int n= a.length;

//         for(int i=0;i<n-1;i++){
//             int min_idx = i;
//             for(int j= i+1;j<n;j++){
//                 if(a[j]< a[min_idx])
//                     min_idx = j;

//             }
//             int temp = a[min_idx]; 
//             a[min_idx] = a[i];
//             a[i] = temp;
//         }
//     }
//     public static void main(String[] args) {
//         selectionsort sl = new selectionsort();
//         int a[] ={12,32,1,24,56,83,98,34,27,8,9};
//         sl.sort(a);

//         int n= a.length;
//         for(int i=0;i<n;++i){
//             System.out.println(a[i] + " ");
//         }
//     }
    
// }
