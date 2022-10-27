import java.util.*;
public class mergesort {
        public static void main(String args[])
    {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<arr.length;i++)
      {
          arr[i]=scn.nextInt();
      }
      System.out.println("given array");
      print(arr);
      mergesorted(arr,0,arr.length-1);
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

    public static void mergesorted(int[] arr,int low,int high)
    {
        int mid;
     if(low<high)
     {
       mid = (low+high)/2;
       mergesorted(arr, low, mid);
       mergesorted(arr, mid+1, high);
       merge(arr,low,mid,high);
     }
    }
    public static void merge(int[] arr,int low,int mid,int high)
    {
        int i,j,k;
        int[] B = new int[100];
        i=low;
        j=mid+1;
        k=low;
        for(;i<=mid&&j<=high;)
        {
            if(arr[i]<arr[j])
            {
             B[k] = arr[i];
             k++;
             i++;
            }
            else
            {
                B[k] = arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid)
        {
            B[k] = arr[i];
            k++;
            i++;
        }
        while(j<=high)
        {
            B[k] = arr[j];
            k++;
            j++;   
        }
        for(int l = low; l<=high ;l++)
        {
            arr[l]=B[l];
        }
    }    
}
