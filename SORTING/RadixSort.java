package SORTING;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        int [] arr ={432,8,530,90,88,231,11,45,677,199};
        int [] result =new int[arr.length];
        // get max element
        int max=Integer.MIN_VALUE;
        for (int x:arr)
            max=Math.max(x,max);
        int pos=1;
        while(max/pos >0){
            pos*=10;
            int [] count = new int[10];
            for (int i=0; i<arr.length; i++)
                ++count[(arr[i]/pos)%10];
            for (int i=1; i<count.length; i++)
            {
                count[i]+=count[i-1];
            }
            for (int i=arr.length-1; i>=0; i--)
            {
                int ind=(arr[i]/pos)%10;
                int countInd=count[ind]-1;
                count[ind]--;
                result[countInd]=arr[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}



/*
first  needed to learn counting sort then learn radix sort
 int temp[] = new int[arr.length];
        int max=arr[0];
        for (int x:arr)
            max=Math.max(max,x);
        int [] freq = new int[max+1];
        for (int i:arr)
            ++freq[i];
        for (int i=1; i< freq.length; i++)
            freq[i]+=freq[i-1];
        for (int i=arrN-1; i>=0; i--)
        {
            temp[freq[arr[i]]-1]=arr[i];
            --freq[arr[i]];
        }
        for (int i=0; i< temp.length; i++)
            arr[i]=temp[i];
        System.out.println(Arrays.toString(arr));

 */