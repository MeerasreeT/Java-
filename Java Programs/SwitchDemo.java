import java.util.Scanner;
public class SwitchDemo{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("1.Add 2.Subtract 3.Multiplication 4.Division  /n Enter your Choice;");
        int ch = scan.nextInt();

        switch(ch)
        { 
          case 1:
           System.out.println(a+b);
           break;
          case 2:
            System.out.println(a-b);
            break;
          case 3:
            System.out.println(a*b);
            break;
           case 4:
            System.out.println(a/b);
            break;
           default:
            System.out.println("invalid");

        }
        scan.close();


    }
}