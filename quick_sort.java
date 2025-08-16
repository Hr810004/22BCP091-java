public class quick_sort {
    static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                //making space
                i++;
                //swapping elements is element is lesser than pivot
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }   
        }
            //else if pivot is lesser then swap it also by making space with i
            i++;
            int temp=arr[i];
            arr[i]=pivot;
            arr[high]=temp;
            return i;
    }

    static void quickSort(int arr[],int low,int high){
        //retrieving index of pivot
        if(low<high){
        int pividx=partition(arr,low,high);
        //doing quick sort for elements lesser pivot        
        quickSort(arr, low, pividx-1);
        //doing quick sort for elements gretaer than pivot
        quickSort(arr, pividx+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
