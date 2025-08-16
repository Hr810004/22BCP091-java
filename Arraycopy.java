class Arraycopy
{ public static void main(String args[])
  {int[] source_array={1,4,2,5,10,32};
   int destination_array[]= new int[source_array.length];
   for(int i=0;i<source_array.length;i++)
   { destination_array[i]=source_array[i];
   }
   System.out.print("Source array is: ["); 
  for(int i=0;i<source_array.length;i++)
   { System.out.print(source_array[i] + " ");
   }
  System.out.println("]");
  System.out.print("Destination array is: ["); 
  for(int i=0;i<destination_array.length;i++)
   { System.out.print(destination_array[i] + " ");
   }
  System.out.print("]");	  
  }
}