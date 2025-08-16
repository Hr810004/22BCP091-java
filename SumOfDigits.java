class SumOfDigits  
{  
public static void main(String arg[])  
 {  
  int number=98,sum=0;  
  System.out.println("Entered number is:" + number);  
  //executes until the condition number!=0 becomes false  
  for(sum=0; number!=0; number=number/10)  
   {  
    //finds the last digit and add it to the variable sum      
    sum = sum + number % 10;  
   }  
  //prints the result 
  System.out.println("Sum of digits: "+ sum);  
 }  
} 