// https://leetcode.com/problems/merge-sorted-array/
import java.util.*;
public class merge {
    public static void mergeArray(int[] a1,int m,int[] a2,int n){
        int i=m+n-1;
        int n1=m-1;
        int n2=n-1;
        while(n1>=0 && n2>=0)
        {
            a1[i--]=a1[n1]>a2[n2]?a1[n1--]:a2[n2--];
        }
        while(n2>=0)
        {
            a1[i--]=a2[n2--];
        }
        System.out.println("sorted array3");
        for(int j=0;j<m+n;j++)
        {
            System.out.print(a1[j]+" ");
        }

    }
    public static void main(String args[])
    {
     try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter m");
         int m=sc.nextInt();
         System.out.println("enter n");
         int n=sc.nextInt();
         int[] a1 = new int[m+n];
         int[] a2 = new int[n];
         System.out.println("enter first array");
         for(int i=0;i<m;i++)
         {
            a1[i]=sc.nextInt();
         }
         System.out.println("enter second array");
         for(int i=0;i<n;i++)
         {
            a2[i]=sc.nextInt();
         }
         mergeArray(a1,m,a2,n);
    }
    }
}
