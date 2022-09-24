public class TotalNoDays {
    public static int dayOfYear(String date) {
        String[] a = date.split("-");
        int year = Integer.parseInt(a[0]);
        int month = Integer.parseInt(a[1]);
        int day = Integer.parseInt(a[2]);
        
        int total = 0;
        
        for(int i=1;i<month;i++)
        {
            if( i == 1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
            {
                total+=31;
            }
            else if(i==2)
            {
                total+= (checkLeap(year))?29:28;
            }
            else
            {
                total+=30;
            }
        }
        total+=day;
        return total;
    }
    public static boolean checkLeap(int y)
    {
        if(y %400 == 0)
        {
            return true;
        }
        else if(y %100 !=0 && y%4==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        String d = "2019-01-09";
        int ans = dayOfYear(d);
        System.out.println(ans);
    }
}
