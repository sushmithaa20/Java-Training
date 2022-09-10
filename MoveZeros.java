// https://leetcode.com/problems/move-zeroes/
import java.util.*;
public class MoveZeros {
    public static void moveZero(int[] a,int n)
    {
        int i=0,j=0,temp;
        while(j<n)
        {
           
            if(a[j]!=0)
            {
                temp=a[j];
                a[j]=a[i];
                a[i]=temp;
                i++;
            }
            j++;
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
       
    } 

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        moveZero(a,n);
    }
}
