public class Selectionsort {
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
         for(int i=0;i<5;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int temp;
        for(int i=0;i<arr.length-1;i++)
        {int minposition=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[minposition]>arr[j]){
                     temp=arr[j];
                     arr[j]=arr[minposition];
                     arr[minposition]=temp; 
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

