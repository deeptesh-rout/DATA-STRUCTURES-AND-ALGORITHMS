package MATRIX;

public class SumOfUpperAndLowerTriangles {

    public static void main(String[] args) {
        int [][] matrix ={
                {6,5,4},
                {1,2,5},
                {7,8,7}
        };
        int n=matrix.length;
        int sumOne=0;
        int sumTwo=0;
        for (int i =0; i<n; i++)
        {
            for (int j=0;j< matrix[i].length; j++)
            {
                    if(i<=j) {
                        System.out.print(matrix[i][j]+" ");
                        sumOne += matrix[i][j];
                    }
                    else sumTwo+=matrix[i][j];

            }
        }
        System.out.println(sumOne+" "+sumTwo+" "+(sumOne+sumTwo));
    }

}
