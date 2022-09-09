
public class Main
{
	public static void main(String[] args) {
	char[] str = new java.util.Scanner(System.in).nextLine().toCharArray();
	for(int i=0,j = str.length-1;i<j;i++,j--)
	{
	    str[i] = (char)((int)str[i] + (int)str[j] -(int)(str[j] = str[i]));
	}
	System.out.println(new String(str));
	}
}
