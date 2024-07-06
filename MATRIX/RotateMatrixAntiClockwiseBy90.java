package MATRIX;

import java.util.Random;

public class RotateMatrixAntiClockwiseBy90 {
    public static void main(String[] args) {
        int [][] matrix= new int[8][8];
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j< matrix[i].length; j++) {
                Random random =new Random();
                matrix[i][j] =random.nextInt(1,9);
            }
        }
        int n=matrix.length;
        int m=matrix[0].length;
        for (int i=0;  i<n; i++)
        {
            int start=0;
            int end=m-1;
            while(start<end)
            {
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++)
            {
                if(i>j)
                    continue;
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for (int [] y:matrix) {
            for (int x : y)
                System.out.print(x+" ");
            System.out.println();
        }
    }
}
