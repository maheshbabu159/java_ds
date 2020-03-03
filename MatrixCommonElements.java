import java.util.HashMap;

public class MatrixCommonElements {
    static void getCommonElements(int[][] matrix, int rows, int cols){
        if(rows <= 0 || cols <= 0 ){
            System.out.println("Rows are empty");
        }
        if(rows == 1){
            System.out.println("All the values are valid");
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        //Iterate through all rows and columns and increase the count
        for(int i = 0; i < rows; i++ ){
            HashMap<Integer, Integer> temp = new HashMap<>();
            for(int j=0; j < cols; j++){
                int value = matrix[i][j];
                if(!map.containsKey(value)){
                    if (i == 0){
                        map.put(value, 0);
                    }else{
                        continue;
                    }
                }else{
                    temp.put(value, 0);
                }
                //System.out.println("i = " + i + " j = " + j + " value = " + matrix[i][j]);
            }

            if (i != 0){
                map.clear();
                map.putAll(temp);;
            }
        }

        // Print all keys and values 
        for(Integer key : map.keySet()){
            int value = map.get(key);
            System.out.println("Key = " + key + " Value = " + value);
            if (value == rows){
                System.out.println("Common value  = " + key);
            }
            //System.out.println("Key = " + key + " Value = " + value);
        }

    }
    public static void main(String[] args){
        int[][] matrix = { {2, 1, 4, 3 }, { 1, 2, 3, 2 }, {3, 6, 2, 3}, {5, 2, 5, 3} };
        getCommonElements(matrix, 4, 4);
    }
}
