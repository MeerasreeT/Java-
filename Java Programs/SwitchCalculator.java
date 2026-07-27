import java.util.Scanner;
class SwitchCalculator{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number 1:");
        double  num1 = scan.nextDouble();

        System.out.print("Enter number 2:");
        double num2 = scan.nextDouble();

        System.out.println("Enter operations");
        System.out.println("+ - * / %");

        char oper = scan.next().charAt(0);

        switch(oper){
            case '+':
                System.out.println("Result"+(num1+num2));
                break;
            case '-':
                System.out.println("Result"+(num1-num2));
                break;
            case '*':
                System.out.println("Result"+(num1*num2));
                break;    
            case '/':
                System.out.println("Result"+(num1/num2));
                break;    
            case '%':
                System.out.println("Result"+(num1%num2));
                break;    
 
        }
    }
}