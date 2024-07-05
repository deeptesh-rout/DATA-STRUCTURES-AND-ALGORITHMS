package MATRIX;

import java.util.Random;

public class MultiDimesionalArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n=arr.length;
        for (int i=0; i<n; i++)
        {
            for (int x:arr[i])
                System.out.print(x+" ");
        }
        int [][] arr2=new int[n][n];
        Random random = new Random();
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++){
                arr2[i][j]=random.nextInt(0,23);
            }
        }
        for (int []x:arr2)
            for (int x1:x)
                System.out.println(x1);
    }
}
