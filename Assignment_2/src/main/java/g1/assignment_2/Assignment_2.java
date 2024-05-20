

package g1.assignment_2;



public class Assignment_2 {
    //Q1
    public static int getSummition(int[] arr,int size)
    {
        int count=0;
        for(int i = 0 ; i <size;i++ )
        {
            count+=arr[i];
        }
        return count;
        
    }
    //Q2
    public static int numOfElement(int[] arr)
    {
        int count=0;
        for(int i = 0 ; i < arr.length;i++)
        {
            count++;
        }
        return count;
    }
    //Q3
    public static int GetMax(int[] arr)
    {
        int max=arr[0];
        for(int i =0 ;i <arr.length;i++)
        {
            if(arr[i]>max)max=arr[i];
        }
        return max;
    }
      //Q4
    public static int GetMin(int[] arr)
    {
        int Min=arr[0];
        for(int i =0 ;i <arr.length;i++)
        {
            if(arr[i]<Min)Min=arr[i];
        }
        return Min;
    }
    //Q5
    public static void SumEvenNumber(int [] arr)
    {
        int count=0;
        int sum=0;
        for(int i = 0 ; i < arr.length;i++)
        {
            if(arr[i] % 2 == 0){
                count++;
                sum+=arr[i];
            }
        }
        System.out.println("Sum of Even Numbers: "+sum);
        System.out.print("Count of Even Numbers: "+count);
        
    }
    //Q6
    public static int Count2(int [] arr)
    {
        int count=0;
        for(int i =0 ;i < arr.length;i++)
        {
            if(arr[i] == 2)count++;
        }
        return count;
    }
    //Q7
    public static void CountGeneral(int [] arr)
    {
        
        int count=0;
        for(int i = 0 ;i<arr.length;i++)
        {
            for(int j = 0 ; j<arr.length;j++)
            {
                if(arr[i] ==arr[j])count++;
            }
            System.out.println(arr[i]+"->"+count);
            count=0;
           
        }
    }

    //Q8
    public static int binarySearch(int [] arr , int num)
    {
        int s=0;
        int e=arr.length -1;
        while(s<=e)
        {
            int mid=(e-s)/2;
            if(arr[mid]== num)
            {
                return num;
            }
            if(arr[mid] > num)
            {
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            
        }
        return -1;
    }
    public static void selectionSort(int [] arr){
        int mi;
        for(int i = 0 ; i<arr.length;i++)
        { 
            mi=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[mi])
                {
                    mi=j;
                }
                
            }
            swap(arr,i,mi);
        }
    }
      public static void swap(int[] arr, int i, int j) {
        // Temporary variable to hold one of the values during the swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int [] arr;
        arr=new int[]{};
     for(int i = 0 ;i<arr.length;i++)
     {
         System.out.print(arr[i]+" ");
     }
     selectionSort(arr);
     System.out.println();
      for(int i = 0 ;i<arr.length;i++)
     {
         System.out.print(arr[i]+" ");
     }
      
    }

  
}
/*
Binary search: 
Best Case->O(1)
Avrage Case->O(Log(n))
Worst Case->O(Log(n))
======================
Linear Search:
Best Case->O(1)
Avrage Case->O(n)
Worst Case->O(n)

*/
