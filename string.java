      // first non repeating
//       import java.util.*;
// public class string{
//     public static void main(String[] args) {
//            String str ="suhgyhs";
       
//         Map<Character,Integer> charCountMap=new LinkedHashMap<>();
     

        
//         for(char c : str.toCharArray()){
//     charCountMap.put(c,charCountMap.getOrDefault(c, 0)+1);

//         }
//         char firstNonRepeatingChar= '\0';

//         for(Map.Entry<Character,Integer>entry : charCountMap.entrySet()){
//                 if(entry.getValue() ==1){
//                         firstNonRepeatingChar = entry.getKey();
//                         break;
//                 }
//         }
//         if(firstNonRepeatingChar != '\0'){
//                 System.out.println("first non repeating char:" + firstNonRepeatingChar);
//         }else{
//                 System.out.println("All characters are repeating.");
//         }
// }
// }






   //sum of two large numbers

//         String  num1= "1234567890";
//         String num2= "6347861790";
//         StringBuilder result = new StringBuilder();

//         int carry =0;
//         int i=num1.length()-1;
//         int j= num2.length()-1;

//         while(i>=0 || j>=0|| carry !=0){
//             int digit1= (i>=0)? num1.charAt(i) - '0':0;
//                int digit2= (j>=0)? num1.charAt(j) - '0':0;

//                int sum = digit1+digit2 + carry;
//                result.append(sum%10);
//                carry = sum/10;

//                i--;
//                j--;


//         }
//         System.out.println("Sum: " + result.reverse().toString());
//     }
// }

   


//         String str ="3534";
//         boolean ispalindrome =true;
//         int n= str.length();
//         for(int i=0;i<n/2;i++){
//             if(str.charAt(i)!=str.charAt(n-i-1)){
//                 ispalindrome=false;
//                 break;
//             }
//         }
//         if(ispalindrome){
//             System.out.println(str + " is a palindrome");

//         }else{
//             System.out.println(str + " is not a palindrome");
//         }
//     }


    
// }

//reverse palindrome
//    String str ="3535";
//    String rev ="";
//    int n= str.length();
//    for(int i=n-1;i>=0;i--){
//     rev =rev+ str.charAt(i);

//    }
 
   

//    if(str.equals(rev)){
//     System.out.println(str + " is a palindrome ");
//    }else{
//     System.out.println(str + " is not a palindrom ");
//    }
//      System.out.println("reversed string is"+ rev);

// }
// }

//




