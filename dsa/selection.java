import java.util.*;
public class selection
{
        public static void main(String args[])
    {
     Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<arr.length;i++)
      {
          arr[i]=scn.nextInt();
      }
      //int arr[] = {1,4,2,3,5};
      System.out.println("given array");
      print(arr);
      System.out.println();
      selectionsort(arr,arr.length-1);
      System.out.println("sorted array");
      print(arr);
    }
    public static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
           // System.out.println("sorted array");
            System.out.print(arr[i]+" ");
        }
    }

    public static void selectionsort(int[] arr,int n)
    {
        int indexmin;
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            indexmin = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    indexmin = j;
                }
            }
           temp = arr[i];
           arr[i] = arr[indexmin];
           arr[indexmin] = temp;
        }
    }
}