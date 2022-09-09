import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String str=sc.nextLine();
	     char key = sc.next().charAt(0);
	    int c=0,sindex=-1;
	    for(int i=0;i<str.length();i++)
	    {
	        if(key == str.charAt(i))
	        {
	            c++;
	        }
	        if(c==2)
	        {
	            sindex=i;
	            break;
	        }
	        
	    }
	    System.out.println(sindex);
	}
}
