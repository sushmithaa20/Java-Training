// https://leetcode.com/problems/majority-element/submissions/

import java.util.*;
public class MejorityElement {
    public static  int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length/2];
        
        }
        public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array 'n' ");
        int n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the array ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        int ans=majorityElement(a);
        System.out.println("ans :"+ans);
    }
    
}
