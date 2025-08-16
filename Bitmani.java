import java.util.*;
public class Bitmani {
 public static void main(String[] args) {
    //for GET bit
    // int n=5;
    // int pos=1;
    // int bitmask = 1<<pos;
    // if((n & bitmask)==0){
    //     System.out.println("Bit is zero");
    //     }
    //     else{
    //         System.out.println("Bit is 1");
    //     }

    //for SET bit
    // int n=5;
    // int pos=1;
    // int bitmask = 1<<pos;
    // if((n | bitmask)==0){
    //     System.out.println("Bit is zero");
    //     }
    //     else{
    //         System.out.println("Bit is 1");
    //     }
    //for CLEAR bit
    // int n=5;
    // int pos=2  ;
    // int bitmask = 1<<pos;
    // int notbitmask=~(bitmask);
    // int newnum= n & notbitmask;
    // System.out.println(newnum);

    //for UPDATE bit
    int n=5;
    int pos=1;
    int bitmask = 1<<pos;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter what operation you want to do add 0 or 1:");
    int opr=sc.nextInt(); 
    sc.close();
    if(opr==1){
        int newnum = n | bitmask;
        System.out.println(newnum);
    }     
    else{
        int notbitmask=~(bitmask);
        int newnum= n & notbitmask;
        System.out.println(newnum);
        }
    }
}