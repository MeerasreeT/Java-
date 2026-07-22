import java.util.Scanner;
public class Control {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter 5 marks:");
        int m1= scan.nextInt();
        int m2= scan.nextInt();
        int m3= scan.nextInt();
        int m4= scan.nextInt();
        int m5= scan.nextInt();
        String res ="";
        int total = m1+m2+m3+m4+m5;
        float avg=total/5.0f;
        String grade="";
        if(m1>34 && m2>34 && m3>34 && m4>34 && m5>34)
        {
            res="pass";
        }

        if (res=="pass")
        {
            if (avg>=85)
            grade="outstanding";
            else if (avg>=75)
            grade="excellent";
            else if (avg>=65)      
            grade="very good";
            else if (avg>=55)
            grade="good";
            else 
            grade="below average";    
        }
        else 
        {
            grade = "No grade because student has failed";

        }
        System.out.println("Total marks: "+total);
        System.out.println("Average marks: "+avg);
        System.out.println("Result:"+res);
        System.out.println("Grade:"+grade);
        
        scan.close();


    }
}