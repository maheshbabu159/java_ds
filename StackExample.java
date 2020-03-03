import java.util.*; 
public class StackExample {

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(19);
        
        Integer element = (Integer) stack.peek(); 
        System.out.println("Peak = " + element);

        Integer pos = (Integer) stack.search(element); 
        System.out.println("Search = " + pos);

    }
}