class LargestNumber
{
    public static void main(String args[])
    {
        int arr[]={2,6,4,10,5,12,8},i,largestnum=arr[0];
        System.out.print("Entered array is: ");
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>largestnum)
            {
                largestnum=arr[i];
            }
        System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Largest number present in array is:" + largestnum);
    }
}