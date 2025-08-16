class Swap
{ public static void main(String args[])
  {int num1=10;
   int num2=20;
   System.out.println("Num1 and Num2 before swapping are:" + num1 + " & " + num2);
   int temp;
   temp=num1;
   num1=num2;
   num2=temp;
   System.out.println("Num1 and Num2 after swapping are:" + num1 + " & " + num2);
  }
}