import java.util.Scanner;
class Year{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year:"); 
        int year = scan.nextInt();
        System.out.print("1.jan 2.feb 3.mar 4.apr 5.may 6.jun 7.jul 8.aug 9.sep 10.oct 11.nov 12.dec \n Enter your month:");
        int ch= scan.nextInt();


 
        switch(ch){
            case 1:
                System.out.println("No .of days: 31");
                 break;
            case 2:
                if(year%4==0){
                    System.out.println("No.of.days: 29");

                }   
                else{
                    System.out.println("No.of.days: 28");
                } 
                break;  

                case 3:
                System.out.println("No .of days: 31");
                 break;
                 case 4:
                System.out.println("No .of days: 30");
                 break;
                 case 5:
                System.out.println("No .of days: 31");
                 break;
                 case 6:
                System.out.println("No .of days: 30");
                 break;
                 case 7:
                System.out.println("No .of days: 31");
                 break;
                 case 8:
                System.out.println("No .of days: 31");
                 break;
                 case 9:
                System.out.println("No .of days: 30");
                 break;
                 case 10:
                System.out.println("No .of days: 31");
                 break;
                 case 11:
                System.out.println("No .of days: 30");
                 break;
                 case 12:
                System.out.println("No .of days: 31");
                 break;
                default:
                  System.out.println("invalid");
                  break; 
            
               
        }


        scan.close();
    }
}