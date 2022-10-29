import java.util.*;
public class MixSeries {
    public static int f(int n)
    {
        if(n == 0){
            return 0;
         } else if(n == 1) {
            return 1;
         } else {
            return (f(n-1) + f(n-2));
         }
    }
    public static int prime(int n)
    {
        int num=1, count=0, i;  
        while (count < n)  
        {  
            num=num+1;  
            for (i = 2; i <= num; i++)  
            {   
                if (num % i == 0)   
                {  
                    break;  
                }  
            }  
            if (i == num)  
            {  
                count = count+1;  
            }  
        }
        return num;
    }  

   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for(int i =1 ;i<=n/2; i++) //works crt for only even numbers
    {
        System.out.print(f(i)+" ");
        // System.out.println();
        System.out.print(prime(i)+" ");
    }
   }
}
