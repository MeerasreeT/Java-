import java.util.Scanner;
public class SwitchDemo_add1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("add sub mul div   /n Enter your Choice:");
        String ch = scan.next();

        switch(ch)
        { 
          case "add":
           System.out.println(a+b);
           break;
          case "sub" :
            System.out.println(a-b);
            break;
          case "mul":
            System.out.println(a*b);
            break;
           case "div":
            System.out.println(a/b);
            break;
           default:
            System.out.println("invalid");

        }
        scan.close();


    }
}