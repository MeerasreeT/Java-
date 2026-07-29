import java.util.Scanner;
class Simppleprograms{
public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter last number:");
    int n= scan.nextInt();
    
    for(int i=n;i>=1;i--){
        System.out.println(i);
    }
    scan.close();
}
}


// import java.util.Scanner;
// class Simppleprograms{
// public static void main(String args[]){
//     Scanner scan = new Scanner(System.in);

//     System.out.print("Enter last number:");
//     int n= scan.nextInt();
    
//     for(int i=1;i<=n;i++){
//         System.out.println(i);
//         continue;
//     }
//     scan.close();
// }
// }
