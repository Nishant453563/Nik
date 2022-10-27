import java.util.*;
public class quicksort
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
      quicksorted(arr,0,n-1);
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

    public static void quicksorted(int[] arr,int low,int high)
    {
        int index;
     if(low<high)
     {
       index = parition(arr,low,high);
       quicksorted(arr, low, index-1);
       quicksorted(arr, index+1, high);
     }
    }
    public static int parition(int[] arr,int low,int high)
    {
        int i = low+1;
        int j = high;
        int pivote = arr[low];
        int temp;
       do{
           while(arr[i]<pivote)
           {
               i++;
           }
           while(arr[j]>pivote)
           {
               j--;
           }
           if(i<j)
           {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
           }
       }while(i<j);

       temp = arr[low];
       arr[low] = arr[j];
       arr[j] = temp;
       return j;
    }
 }
