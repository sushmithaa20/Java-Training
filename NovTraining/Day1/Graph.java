import java.util.*;
public class Graph {
    public static void main(String args[])
    {
        //String[] a = {"R","U","L","D","R"};
        Scanner sc = new Scanner(System.in);
        int x=0, y =0;
        int n;
        int incr=10;
        n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
           if(i%5==0 || i%5 == 4)
           {
            x+=incr;
           }
           if(i%5 == 1)
           {
            y+=incr;
           }
           if(i%5 == 2)
           {
            x-=incr;
           }
           if(i%5 == 3)
           {
            y-=incr;
           }
           incr+=10;
        }
        System.out.println(x + " "+ y);
    }
}
