import java.util.*;
public class Replace {
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         String s1= sc.nextLine();
         String s2 = sc.nextLine();
         String s3 = sc.nextLine();

         String s4 = s1.replaceAll("[aeiouAEIOU]", "*");
         String s5 = s2.replaceAll("[^aeiouAEIOU[0-9]]", "@");

         String s6 = s3.toUpperCase();
         System.out.println(s4+s5+s6);
    }
    
}
