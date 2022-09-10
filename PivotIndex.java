
import java.util.*;
public class PivotIndex {

    public static int pivotIndex(int[] nums) {
        int rsum=0,lsum=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(j<i)
                {
                    lsum=lsum+nums[j];
                }
                else if(j>i)
                {
                    rsum=rsum+nums[j];
                }
            }
            if(lsum == rsum)
            {
                return i;
            }
          
            rsum=0;
            lsum=0;
        }
        return -1;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array 'n' ");
        int n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the array ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int p=pivotIndex(a);
        System.out.println("Pivot index is: "+p);
        sc.close();
    }
    
}
