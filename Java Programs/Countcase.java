import java.util.Scanner;

class Countcase {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mail: ");
        String name = sc.next();
        int alpha = 0;
        int numbers = 0;
        int special_char = 0;

        int length = name.length();

        for (int i = 0; i < length; i++) {

            char ch = name.charAt(i);

            if (ch=='@'){
                break;
            }

            if(ch >= 'a' && ch <= 'z') 
               {

                alpha++;

            } 
            else if (ch>='0' && ch<='9') {

               numbers++;
               }
            else {
               special_char++;
            }
        }

        System.out.println("Alphabets: " + alpha);
        System.out.println("Numbers: " + numbers);
        System.out.println("Special Characters: " + special_char);

        sc.close();
    }
}