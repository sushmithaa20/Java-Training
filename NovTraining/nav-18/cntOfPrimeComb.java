import java.util.*;
public class Main
{
    public static boolean isprime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		int n;
		int sum=0;
		int cnt=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
		    if(isprime(i))
		    {
		        //System.out.print(i+" ");
		        sum=sum+i;
		       // System.out.println(sum);
		    
		    
		    if(isprime(sum)&& sum<n)
		    {
		        cnt++;
		    }
		    }
		   
		}
		System.out.println(cnt-1);
	}
}
