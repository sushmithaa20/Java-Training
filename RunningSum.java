

import java.util.*;
public class RunningSum {
    public static int[] runningSum(int[] a,int n)
    {
        int[] b= new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
            b[i]=sum;
        }
        return b;
        
    }
    public static void main(String arfs[])
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
        a=runningSum(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
    
}
