class MatrixMultiplication
{
    public static void main(String args[])
    {
        int matrix1[][] = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}};
        int matrix2[][] = {
                    {9,8,7},
                    {6,5,4},
                    {3,2,1}};
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        //initializing Result Matrix
        int Result[][] = new int[rows][columns];
        // performing Matrix Multiplication
          for(int i=0;i<rows;i++)
          {
            for(int j=0;j<columns;j++)
            {
                for(int k=0;k<columns;k++)
                {
                     Result[i][j]+= matrix1[i][k]*matrix2[k][j];
                }
               
            }
          } 

        // Printing the result matrix
        System.out.println("Resultant Matrix After Multiplication:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                System.out.print(Result[i][j] + " ");
            } 
            System.out.println();
            
        }
    }
}
