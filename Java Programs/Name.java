import java.util.Scanner;

class Name{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name:");
        String name = scan.next();

        System.out.print("Enter character:");
        char ch = scan.next().charAt(0);
        
        int length=name.length();
        System.out.println("Length:"+length);
        int count=0;

        for(int i=0;i<length;i++){
            char a=name.charAt(i);
             
            if(a==ch){
                System.out.println(a+" is found at "+i);
                count++;
            }

        }
        if(count==0){
            System.out.print(" not found");

        }

        scan.close();


    }
}