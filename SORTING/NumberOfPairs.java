package SORTING;

public class NumberOfPairs {
    public static void main(String[] args) {
        int [] x ={2,1,6};
        int n1=x.length;
        int [] y={1,5};
        int n2=y.length;
        int count=0;
        for (int i=0; i<n1;i++)
        {
            for (int j=0; j<n2; j++)
            {
                if(Math.pow(x[i],y[j])>Math.pow(y[j],x[i]))
                    count++;6
            }
        }
        System.out.println(count);
    }
}
