import java.util.Scanner;
public class SwitchDemo_add{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("a.Add b.Subtract c.Multiplication d.Division  /n Enter your Choice;");
        char ch = scan.next().charAt(0);

        switch(ch)
        { 
          case 'a':
            case 'A':
           System.out.println(a+b);
           break;
          case 's' :
            case 'S':
            System.out.println(a-b);
            break;
          case 'm':
            case 'M':
            System.out.println(a*b);
            break;
           case 'd':
            case 'D':
            System.out.println(a/b);
            break;
           default:
            System.out.println("invalid");

        }
        scan.close();


    }
}