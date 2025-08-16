import java.util.*;
class Multiplication_table
{ public static void main(String args[])
  {Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number for which you want multiplication table:");
   int num = sc.nextInt();
   sc.close();
   int i;
   System.out.println("Multiplication table of 6 is:");
   for(i=1;i<11;i++)
      {System.out.println(num + " * "+ i +" = " + num*i);
      }
  }
}