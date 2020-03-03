public class SelectionSortIterative {
    static int[] selectionSort(int[] a){
        if(a.length == 0){ return a; }
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length ; j ++){
                if(a[j] > a[i]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }
    public static void main(String[] args){
        int[] array = { 7, 2, 5, 6, 8, 9};
        int[] result = selectionSort(array);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}