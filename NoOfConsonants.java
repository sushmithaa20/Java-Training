import java.util.*;


public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str=sc.nextLine();
	    int c=0;
	    char ch;
 
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if((ch>65 && ch<90) || (ch>97 && ch<122))
            {
                if( ch == 'a' || ch =='e' || ch=='i' || ch =='o' || ch=='u')
                {
                    continue;
                }
                else
                {
                    c++;
                }
            }
        }
       
        System.out.println(c);
        
	}
}
