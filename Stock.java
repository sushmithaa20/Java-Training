class Stock{

    public static int maxProf(int prices[],int n ){
        int buy=prices[0];
        int tp=0;
        int maxp=0;
        for(int i=0;i<n;i++)
        {
            if(prices[i]<buy)
            {
                buy=prices[i];
            }
            tp=prices[i]-buy;
            if(tp>maxp){
                maxp=tp;
            }
        }
        return maxp;
    }

    public static void main(String args[])
    {
        int prices[] ={7,1,5,6,4};
        int n = prices.length;
        int maxprof=maxProf(prices,n);
        System.out.println("MAx profit is "+maxprof);
    }
}

