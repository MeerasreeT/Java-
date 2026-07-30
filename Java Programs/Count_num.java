import java.util.Scanner;
public class Count_num {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of terms:");
        int n = scan.nextInt();

        
        int evenCount =0;
        int oddCount =0;
        System.out.print("Enter numbers");

        for (int i=0;i<n;i++){
           
            int num = scan.nextInt();
            if(num%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.print("Odd numbers: "+oddCount);
        System.out.print("Even numbers:"+evenCount);
        scan.close();
    }
}
// import java.util.Scanner;

// public class Count_num {
//     public static void main(String args[]) {

//         Scanner scan = new Scanner(System.in);

//         System.out.print("Enter number of terms: ");
//         int n = scan.nextInt();

//         int evenCount = 0;
//         int oddCount = 0;

//         System.out.println("Enter numbers:");

//         for (int i = 0; i < n; i++) {

//             int num = scan.nextInt();

//             if (num % 2 == 0) {
//                 evenCount++;
//             } else {
//                 oddCount++;
//             }
//         }

//         System.out.println("Even numbers: " + evenCount);
//         System.out.println("Odd numbers: " + oddCount);

//         scan.close();
//     }
// }