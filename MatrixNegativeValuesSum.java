public class MatrixNegativeValuesSum{
    public static int getNegativeNumbersCount(int[][] a){
        int total = 0;
        int m = a.length;
        if(m==0){
            return 0;
        }
        int n = a[0].length;

        for(int i=0; i<m; i++){
            for(int j = n-1; j>=0; j--){
                if(a[i][j]<0){
                    total = total + 1;
                }
            }
        }

        return total;
    }
    public static int getNegativeNumbersBinarySearchCount(int[][] a){
        int total = 0;
        int m = a.length;
        if(m==0){
            return 0;
        }
        int n = a[0].length;

        for(int i=0; i<m; i++){
            int result = recursive(0, n-1, a, 0, i);
            total = total + result;
            System.out.println("Rows = " + total);
        }

        return total;
    }

    static int recursive(int lowerBound, int upperBound, int[][] a, int count, int i){
        int curIn = (lowerBound + upperBound)/2;
        System.out.println("lowerBound = " + lowerBound);
        System.out.println("upperBound = " + upperBound);
        System.out.println("value = " + a[i][curIn]);

        if(lowerBound>upperBound){
            System.out.println("Columns = " + count);
            return count;
        }
        if(a[i][curIn]<0){
            count = count +  (upperBound + 1 - curIn) ;
            count = recursive(lowerBound, curIn - 1, a, count, i);
        } else {
            count = recursive(curIn + 1, upperBound, a, count, i);
        }
        return count;
    }
    public static void main(String[] arags){
        int[][] a = {{4,3,2,-1},{3,2,1,-1}, {1,1,-1,-2}, {-1,-1,-2,-3}};
        int result = getNegativeNumbersBinarySearchCount(a);
        System.out.println("Total rresult = " + result);

    }
}