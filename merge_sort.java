class merge_sort{
    public static void conquer(int arr[],int si,int mid,int ei){
        int merged[]= new int[ei-si+1];
        int index1 = si;
        int index2 = mid+1;
        int intital=0;
            while(index1<=mid && index2<=ei){
                if(arr[index1]<=arr[index2]){
                    merged[intital++]=arr[index1++];
                }
                else{
                merged[intital++]=arr[index2++];
                }
            }
            while(index1<=mid){
                merged[intital++]=arr[index1++];
            }
            while(index2<=ei){
                merged[intital++]=arr[index2++];
            }
            for(int i=0,j=si;i<merged.length;i++,j++){
                arr[j]=merged[i];
            }
    }
    public static void divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        else{
            int mid=si+(ei-si)/2;
            divide(arr,si,mid);
            divide(arr,mid+1,ei);
            conquer(arr,si,mid,ei);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        System.out.println("Array before sorting through merge sort is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        divide(arr,0,n-1);
        System.out.println("Array after sorting through merge sort is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}