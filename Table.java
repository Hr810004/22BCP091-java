import java.util.Scanner;
class Table
{ public static void main(String args[])
  {Scanner sc=new Scanner(System.in);
   System.out.print("Enter a number:");
   int num=sc.nextInt();
   int i=0;
   System.out.println("Multiplication table of " + num + " is:");
   for(i=0;i<11;i++)
      {System.out.println(num + " * " + i + " = " + num*i);}
  }
}