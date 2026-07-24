
import java.util.Scanner;
public class Eb{
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter unit:");
        int unit = scan.nextInt();
        float amt=0.0f;

        if (unit <= 500)
        {
           if (unit <=200)
           amt = 0;
           else if (unit>=201 && unit<=400)
           amt = (unit - 200 ) *4.70f;
           else  
           amt = (unit - 400 )* 6.30f + ((200)*4.70f);
          
       
        }
        else{
            
         
            amt = (unit - 500)*8.40f + ((300)*4.70f) + ((100)*6.30f);
          
            
        }
       
        System.out.println("The Bill amount is :"+amt);
        scan.close();
        }  
        
    
    
}

// public class Aeb{
//     public static void main(String args[])
//     {
//         System.out.format("Welcome to java");
//     }
// }

// public class Sample
// {
//     public static void main(String args[]){
//         int k = 100;
//         String name = "Meera";
//         float height = 165.9f;
//         System.out.format("Name:%s \n Mark:%d \n Height:%f ",name,k,height);
//     }
// }