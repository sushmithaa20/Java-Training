import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 int n;
        int res=0,cnt=1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        String s1= sc.nextLine();
        String[] s = s1.split(" ");
        int n1=Integer.parseInt(s[0]);
        int n2 = Integer.valueOf(s[n - 1]);
        int p=0,q=0;
        for(int i=0;i<n;i++)
        {
            if(n1 != Integer.valueOf(s[i]))
            {
                p=i;
                break;
            }
        }
        for(int i=n-2;i>0;i--)
        {
            if(n2!=Integer.valueOf(s[i]))
            {
                q=i;
                break;
            }
        }
        // System.out.println(p +" "+q);
        for(int i=p;i<=q;i++)
        {
            if(Integer.valueOf(s[i]) == Integer.valueOf(s[i+1]))
            {
                cnt++;
            }
            if(cnt>res)
            {
                res =cnt;
            }
            if( Integer.valueOf(s[i]) != Integer.valueOf(s[i+1]))
            {
                cnt=1;
            }
        }
        System.out.println(res);
}
}
