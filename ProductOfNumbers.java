import java.util.ArrayList;

public class ProductOfNumbers {
    static ArrayList<Integer> array = new ArrayList<>();
    public ProductOfNumbers() {
        
    }
    
    public static void add(int num) {
        array.add(num);
    }
    
    public  static int getProduct(int k) {
        int total = 1;

        for(int i = array.size() - 1; i >= (array.size() - k); i--){
            total =   array.get(i) * total;
        }
        return total;
    }

    public static void main(String[] args){
        add(3);
        add(0);
        add(2);
        add(5);
        add(4);

        int result = getProduct(2);
        System.out.println("Result = " + result);
        add(8);
        int result2 = getProduct(6);
        System.out.println("Result2 = " + result2);
       
    }
}