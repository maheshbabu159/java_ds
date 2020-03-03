import java.util.Arrays;

public class Sort{
    static int[] bubbleSort(int[] inputArray){
        if (inputArray.length==0) {
            return inputArray;
        }
        for(int i = 0; i < inputArray.length; i++){
            for(int j = 0; j < inputArray.length - 1; j ++ ){
                if(inputArray[j] > inputArray[j + 1]){
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }

                for(int x = 0; x < inputArray.length; x++){
                    //System.out.println(inputArray[x] + "\t");
                }
                //System.out.println("\n");

            }

        }
        return inputArray;
    }



    static int[] mergeSort(int[] inputArray){
        if (inputArray.length==0) {
            return inputArray;
        }

        int middle = inputArray.length/2;
        int[] left = Arrays.copyOfRange(inputArray, 0, middle);
        int[] right = Arrays.copyOfRange(inputArray, middle, inputArray.length);

        for(int i = 0; i < left.length; i++){
            left[i] = inputArray[i];
        }
        for(int i = 0; i < right.length; i++){
            right[i] = inputArray[i];
        }

        left = mergeSort(left);
        right = mergeSort(right);
        return left;
    }

    



    /**
     * Selection sort is done by taking the smalles or largest element and swapping
     * with first element
     */
    static int[] selectionSort(int[] inputArray){
        int[] result = new int[inputArray.length];
        if(inputArray.length == 0){
            result = inputArray;
            return result;
        }

        for(int i = 0; i < inputArray.length; i++){
            for(int j = 0; j < inputArray.length ; j++){
                if(inputArray[i] > inputArray[j]){
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
            for(int x = 0; x < inputArray.length; x++){
                System.out.println(inputArray[x] + "\t");
            }
            System.out.println("\n");
        }

        return inputArray;
    }
    static int[] quickSort(int[] array){
        int[] result = new int[array.length];
        sort(array, 0, array.length - 1);
        return result;
    }

    static void sort(int[] numbers, int start, int end){
        if (start < end) {
            int p = partition(numbers, start, end);
            sort(numbers, start, p - 1);
            sort(numbers, p + 1, end);
        }
    }
    static int partition(int[] numbers, int start, int end){
        int pivot = numbers[end];
        int x = start - 1;

        for (int i = start; i < end; i++) {
            if (numbers[i] < pivot) {
                x++;
                swap(numbers, x, i);
            }
        }
        swap(numbers, x + 1, end);
        return x + 1;  
    }


    static void swap(int[] numbers, int j, int k) {
        int temp = numbers[j];
        numbers[j] = numbers[k];
        numbers[k] = temp;
    }


    public static void main(String[] args){
        int[] array = {62, 6, 32, 1, 4, 43};
        int[] result = selectionSort(array);
        for(int i = 0; i < result.length ; i++){
            //System.out.println(Array.to);
        }
    }
}