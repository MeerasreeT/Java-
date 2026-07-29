// import java.util.Scanner;

// public class Simpleforloop {
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);

//         System.out.print("Enter n:");
//         int n = scan.nextInt();
//         int fact=1;

//         for(int i=1;i<=n;i++){
//               System.out.print(i+" ");
//               fact=fact*i;
            

            
        
//         }
//         System.out.println(" \nFactorial="+fact);
//         scan.close();
//     }
// }

import java.util.Scanner;
public class Simpleforloop {
   public static void main(String args[]){
         Scanner scan = new Scanner(System.in);

         System.out.print("Enter n:");
         int n= scan.nextInt();

         int sum=1;
         for(int i=1;i<=n;i++){
           if(i%2==0){
            System.out.print(i);
           }
           sum=sum*i;

         }
         System.out.println("\nProduct= "+sum);

         scan.close();
   }
}        



