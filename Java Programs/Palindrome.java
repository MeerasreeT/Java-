import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("enter num:");
        int n = scan.nextInt();
        int b=n;
        int reverse = 0;

        while(n!=0){
            int a = n%10;
            reverse = reverse *10+a;
            n=n/10;

        }
        
        System.out.print(reverse);
        if(b==reverse){
            System.out.print(" Palindrome");
        }
        else{
            System.out.print(" Not a Palindrome");
        }
        scan.close();

    }
    
}
