
public class QuickSort{
    public static int[] quickSort(int[] numbers, int start, int end){
        if (start < end) {
            int p = partition(numbers, start, end);
            quickSort(numbers, start, p - 1);
            quickSort(numbers, p + 1, end);
        }
        return numbers;
    }

    public static int partition(int[] numbers, int start, int end){
        int pivot = numbers[end];
        int x = start - 1;

        for (int i = start; i < end; i++) {
            if (numbers[i] < pivot) {
              x++;

              if(x!=i){
                int temp = numbers[x];
                numbers[x] = numbers[i];
                numbers[i] = temp;
              }
            
            }

            System.out.println(java.util.Arrays.toString(numbers));
            System.out.println("\n ");
        }        
        int temp = numbers[x + 1];
        numbers[x+1] = numbers[end];
        numbers[end]= temp;

        System.out.println(" After for");
        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println("\n ");
        return x + 1;
    }
    public static void main(String[] args){
        int[] array = {7,15,14,5,9,18,3,21,23,16,12};
        int[] result = quickSort(array,0, array.length - 1);
        for(int i = 0; i < result.length; i++ ){
            System.out.println(array[i]);
        }
    }

}