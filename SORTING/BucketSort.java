package SORTING;

import java.util.ArrayList;

public class BucketSort {
    public static void main(String[] args) {
        float [] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 23f};
       ArrayList<Float>[] bucket = new ArrayList[arr.length];
       for (int i=0; i< arr.length; i++)
           bucket[i]=new ArrayList<>();
       for (int i=0;i< arr.length;i++)
       {

       }
        System.out.println(arr[5]* arr.length);
    }
}
