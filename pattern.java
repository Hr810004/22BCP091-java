public class pattern{

// 0 and 1 triangle
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows:");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print("1 ");
//                 }
//                 else{
//                     System.out.print("0 ");
//                 }
                
//             }
//             System.out.println();
//         }
//     }


//Butterfly pattern
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows:");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             int spaces=2*(n-i);
//             for(int j=1;j<=spaces;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             int spaces=2*(n-i);
//             for(int j=1;j<=spaces;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }


// Star Rhombus
// public static void main(String[] args){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         int spaces = n-i;
//         for(int j=1;j<=spaces;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=n;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//         }
//     }


//Number pyramid
// public static void main(String[] args) {
//     int n=5;
//     for(int i=1;i<=n;i++){
//         //print spaces
//         int spaces = n-i;
//         for(int j=1;j<=spaces;j++){
//             System.out.print(" ");
//         }
//         //print row no,row no times
//         for(int j=1;j<=i;j++){
//             System.out.print(i + " ");
//         }
//         System.out.println();
//       }
//    }


//number palindrome pyramid
// public static void main(String[] args) {
//     int n=5;
//     //for spaces
//     for(int i=1;i<=n;i++){
//         int spaces=n-i;
//     for(int j=1;j<=spaces;j++){
//         System.out.print(" ");
//         }
//     //for first part till reaching 1
//     for(int j=1;j<=i;j++){
//         System.out.print(i+1-j);
//         }
//     //for second part till reaching j
//     for(int j=2;j<=i;j++){
//         System.out.print(j);
//         }
//     System.out.println();
//         }
//     }


//diamond pattern
// public static void main(String[] args) {
//     int n=4;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//     //for first part till reaching 1
//         for(int j=1;j<=2*i-1;j++){
//             System.out.print("*");
//         }
//     //for second part till reaching j
//         System.out.println();
//         }
//     for(int i=n;i>=1;i--){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//     //for first part till reaching 1
//         for(int j=1;j<=2*i-1;j++){
//             System.out.print("*");
//         }
//     //for second part till reaching j
//         System.out.println();
//         }
//     }
}
