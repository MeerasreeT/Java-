// import java.util.Scanner;

// public class Vowels {
//     public static void main(String args[]) {

//         Scanner scan = new Scanner(System.in);

//         System.out.print("Enter name: ");
       
//         String name = scan.next();

       
//         int length = name.length();
       
//         System.out.println("Length = " + length);

//         int count = 0;

//         for (int i = 0; i < length; i++) {

//             char ch = name.charAt(i);
//             switch (ch) {
//                 case 'a':
//                     System.out.println("a");
//                     count++;
//                     break;
//                 case 'e':
//                     System.out.println("e");
//                     count++;
//                     break;
//                 case 'i':
//                     System.out.println("i");
//                     count++;
//                     break;
//                 case 'o':
//                     System.out.println("o");
//                     count++;
//                     break;
//                 case 'u':
//                     System.out.println("u");
//                     count++;
//                     break;
//             }
//         }

//         System.out.println("Count = " + count);
//         scan.close();
//     }
// }

import java.util.Scanner;
class Vowels{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scan.next();

        int length = name.length();
        System.out.println("Length = " + length);
          
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
        scan.close();

    }
}                                                                                                     v