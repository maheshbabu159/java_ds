public class StringReversal {
    static String reverse(String input){
        String result = "";
        //Iterate through every character and put every character in a string
        int stringLenght = input.length();
        for( int i = stringLenght - 1; i >= 0; i--){
            char value = input.charAt(i);
            result = result + value;
        }
        return result;
    }
    public static void main(String[] aStrings){
        String result = reverse("abc");
        System.out.println("Result = " + result);
    }
    
}