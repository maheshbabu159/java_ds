public class BinarySearchIterative{
    static boolean binarySearch(int[] a, int val){
        if(a.length==0) { return false; }
        int lowerBound = 0;
        int upperBound = a.length - 1;
        while(lowerBound<upperBound){
            int curIn = (lowerBound + upperBound)/2;
            if(a[curIn]==val){ return true; }
            if(val > a[curIn]){
                lowerBound = curIn + 1;
            }else {
                upperBound = curIn- 1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] array = {8,30, 40, 60, 80,90};
        System.out.println(binarySearch(array, 100));
    }
}