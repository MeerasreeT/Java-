// class Forloop{
//     public static void main(String args[]){
//         for (int i=1;i<=10;i++){
//             System.out.print(i+ ".Meera\n");
//         }
//     }
// }

// import java.util.Scanner;

// class Forloop {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);

//         System.out.print("Enter n: ");
//         int n = scan.nextInt();
// int s=0;
//         for (int i = 1; i <= n; i++) {         
//             s=s+i;
//             System.out.print(i);
//             if (i < n) {
//                 System.out.print("+");
//             }
//         }
// System.out.println("="+s);
//         scan.close();
//     }
// }
import java.util.Scanner;

class Forloop{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Enter no:");
        int n=scan.nextInt();
        
    
        for(int i = 1;i<=10;i++){
            System.out.println(i+"*"+n+"="+(i*n));
        }
     
        scan.close();
    }
}