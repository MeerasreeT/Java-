import java.util.Scanner;
class Percentage{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter price amount:");
        int amount = scan.nextInt();
        float percentage_amt = 0.0f;

        if (amount<1000)
           percentage_amt = 0;
        else if(amount>=1000 && amount<=1999)
            percentage_amt = (amount*5/100);
        else if(amount>=2000 && amount<=3999)
            percentage_amt = (amount*7/100);
        else if(amount>=4000 && amount<=5999)
            percentage_amt = (amount*8/100);
        else
            percentage_amt = (amount*10/100);
        System.out.println("Discount Amount is "+percentage_amt);
        scan.close(); 
    }
}