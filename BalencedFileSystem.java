

import java.util.*;
public class BalencedFileSystem {

    public static int balencedFile(int[] p,int[] f,int n)
    {
        int[] t = new int[n];
        int cur;
         int temp=0;
        for(int i=0;i<n;i++)
        {
            cur=i;
            while(cur!=-1)
            {
                t[cur]+=f[i];
                cur=p[cur];
            }
        }
        int val = Math.abs(t[0]-2*t[1]);
         for(int i=1;i<n;i++)
         {
            temp = Math.abs(t[0]-2*t[i]);
            if(val>temp)
            {
               val = temp;
            }
         }
         return val;
    }
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enetr the size of array");
        int n=sc.nextInt();
        int[] p= new int[n];
        int[] f = new int[n];
        System.out.println("enetr the parent array");
        for(int i=0;i<n;i++)
        {
            p[i]=sc.nextInt();
        }
        System.out.println("enetr the file size array");
        for(int i=0;i<n;i++)
        {
            f[i]=sc.nextInt();
        }
        int ans = balencedFile(p,f,n);
        System.out.println("ans :" +ans);

        sc.close();
    }
}
