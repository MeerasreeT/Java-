import java.util.Scanner;
class Fibonacci{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number of terms:");
        int n = scan.nextInt();

        int num1=0;
        int num2=1;

        for(int i=1;i<=n;i++){
            System.out.println(num1);
              int num3=num1+num2;
                    num1=num2;
                    num2=num3;

        }
    

        scan.close();

    }
}