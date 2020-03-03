public class MaximumStudents{

    public static int maxStudents(char[][] seats) {
        int count = 0;
        int rows = seats.length;
        int cols = seats[0].length;
        System.out.println("Rows = " + rows);
        System.out.println("Cols = " + cols);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.println("Value = " + seats[i][j]);
                if(seats[i][j] == '.'){
                    if(i-1 >= 0 && j-1 >= 0 && seats[i-1][j-1] == '.' ){
                        seats[i][j] = '#';
                    }else if (i-1 >= 0 && j+1 < cols && seats[i-1][j+1] == '.'){
                        seats[i][j] = '#';
                    }else if (j-1 >= 0 && seats[i][j-1] == '.'){
                        seats[i][j] = '#';
                    }else if (j+1 < cols && seats[i][j+1] == '.'){
                        seats[i][j] = '#';
                    }else{
                        count = count + 1;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        char[][] seats = {
            {'#','.','.','.','#'},
            {'.','#','.','#','.'},
            {'.','.','#','.','.'},
            {'.','#','.','#','.'},
            {'#','.','.','.','#'}
        };
        System.out.println(maxStudents(seats));

    }
}