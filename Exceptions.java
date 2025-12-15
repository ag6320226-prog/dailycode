
// import java.io.File;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.FilterWriter;
// public class Exceptions  {
//     public static void main(String[] args) {
//       createData();
//       readFileData();
//       deleteFile();


// //     System.out.println("hello");
// //     try{
// //         // int a=5;
// //         // int b=5;
// //         // int c=a/b;
// //         int arr[]={1,24};

// //         System.out.println(arr[2]);
// //     }catch (ArithmeticException e){
// //         System.out.println(e);

// //     }
// //     System.out.println("byy");

// //     }
//     // int arr[]={1,2,3};
//     // String str=null;

//     // int a=3;
//     // int b=3;
//     // int c=a/b;
//     // System.out.println(c);
//     // System.out.println("byyy");
//     //voteAge();
    
//     // try {
//     //     voteAge(18);
//     // }catch(IllegalArgumentException e){
//     //     System.out.println(e);
//     // }


    
//     // }

//     //  static void voteAge(int age){
//     //     if(age<18){
//     //         throw new IllegalArgumentException("check for vot");
//     //     }else{
//     //         System.out.println("aap vote nhi de sakte");
            
//     //     }

//     //     }

//     // }
//     //teen size ka sub arr [5,-3,0,6,3,7];k=3 // sliding window
// // try{
// //     rishkyMethod();

// // } catch ( ArithmeticException e){
// //     System.out.println("Main se handle hua:"+e);
// // }
// // System.out.println("program continue..");
// //     }
// //     static void rishkyMethod() throws ArithmeticException{
// //         System.out.println("rishkyMethos start");
// //         int result= 10/0;
// //         System.out.println("rishkyMethod end"+ result);

// //         throw new ArithmeticException("exception from rishkyMethod");

// //     }
// // }






//         try{
//             File file = new File("home.html");
//             if(file.createNewFile()){
//                 System.out.println("done"+ file.getName());
//             }else{
//                 System.out.println("already file created");
//             }
//         }catch (Exception e){
//             System.out.println(e);
//         }
//     }

//     static void createData(){
//         try{
//             FileWriter writer=new FileWriter("index.html");
//             writer.write("Hello new file data  Hoe are you bro");
//             writer.close();

             
//         }catch(Exception e){
//             System.out.println(e);
//         }
//     }
//     static void readFileData(){
//         try{
//             FileReader reader = new FileReader("index.html");
//             int ch;
//             while((ch=reader.read())!=-1){
//                 System.out.print((char)ch);
//             }


//         }
//         catch(Exception e){
//         }
//     }
//     static void deleteFile(){
//         try{
//             File file=new File("index.html");
//             if(file.delete()){
//                 System.out.println("delete file");
//             }else{

//             }
//         }catch(Exception e){
//             System.out.println(e);
//         }

//     }

    
// }









    

