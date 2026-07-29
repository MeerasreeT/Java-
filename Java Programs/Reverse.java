import java.util.Scanner;
public class Reverse {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter numbers:");
        int n=scan.nextInt();
        int reverse =0;

        
        while(n!=0){
            int digit = n%10;
            reverse= reverse*10+digit;
            n=n/10;
        }
        System.out.print("Reverse order is:  "+reverse);
        scan.close();
    }
}
