import java.util.Scanner;

public class SKUs {
    public static void main(String args[])
    {
        int n=0;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        String[] s1= sc.nextLine().split(" ");
        String[] s2 = sc.nextLine().split(" ");
        String[] s3 = sc.nextLine().split(" ");
        for(int i = 0; i<n ;i++)
        {
            if(Integer.valueOf(s3[i])>0)
            {
                sum+=( Integer.valueOf(s1[i]) ) * ( Integer.valueOf(s2[i]) );
            }
        }
       System.out.println(sum);

    }
    
}
