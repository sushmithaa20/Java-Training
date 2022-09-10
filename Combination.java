// https://leetcode.com/problems/combinations/

import  java.util.*;
public class Combination {
    public static List<List<Integer>> Comb(int n,int k)
    {
        List<List<Integer>> ans= new ArrayList<>();
        int[] set = new int[n];
        for(int i=0;i<n;i++)
        {
            set[i]=i+1;
        }
       
        ArrayList<Integer> subset = new ArrayList<Integer>(k);
        generateSubset(set,1,k,subset,ans,n);
        return ans;

    }
   
    static void generateSubset(int[] set,int index,int k,ArrayList<Integer> current,List<List<Integer>> ans,int n) {
       
        if(current.size() == k)
        {
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int j=index;j<=set.length && n-j+1 >=k-1 ;j++)
        {
            current.add(j);
            generateSubset(set,j+1,k,current,ans,n);
            current.remove(current.size() - 1);
           
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n= sc.nextInt();
        System.out.println("enter the value of k");
        int k= sc.nextInt();
        List<List<Integer>> ans= new ArrayList<>();
        ans = Comb(n,k);
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
        sc.close();

    }
    
}
