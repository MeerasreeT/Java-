import java.util.Scanner;
class Year{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year:"); 
        int year = scan.nextInt();
        System.out.print("jan feb mar apr may jun jul aug sept oct nov dec \n Enter your month:");
        String ch= scan.next();
        switch(ch){
            case "jan":
                System.out.println("No .of days: 31");
                 break;
            case "feb":
                if(year%4==0){
                    System.out.println("No.of.days: 29");

                }   
                else{
                    System.out.println("No.of.days: 28");
                } 
                break;  

                case "mar":
                System.out.println("No .of days: 31");
                 break;
                 case "apr":
                System.out.println("No .of days: 30");
                 break;
                 case "may":
                System.out.println("No .of days: 31");
                 break;
                 case "jun":
                System.out.println("No .of days: 30");
                 break;
                 case "jul":
                System.out.println("No .of days: 31");
                 break;
                 case "aug":
                System.out.println("No .of days: 31");
                 break;
                 case "sept":
                System.out.println("No .of days: 30");
                 break;
                 case "oct":
                System.out.println("No .of days: 31");
                 break;
                 case "nov":
                System.out.println("No .of days: 30");
                 break;
                 case "dec":
                System.out.println("No .of days: 31");
                 break;
                default:
                  System.out.println("invalid");
                  break; 
            
               
        }


        scan.close();
    }
}