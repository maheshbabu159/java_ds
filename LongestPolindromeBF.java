public class LongestPolindromeBF{
    public static String findPolindrome(String input){
        String result = "";
        int maxLenght = 0;
        for(int i = 0; i < input.length(); i++){
            for(int j = i; j < input.length(); j++){
                String subString = input.substring(i, j+1);
                //System.out.println(subString);
                if(isPolindrome(subString)){
                    if(maxLenght < subString.length()){
                        maxLenght = subString.length();
                        result = subString;
                    }
                }
            }
        }
        return result;
    }
    public static boolean isPolindrome(String subString){
        boolean flag = true;
        for(int i=0;i<subString.length()/2;i++){
            if(subString.charAt(i)!=subString.charAt(subString.length()-i-1)){
                return false;
            }
        }
        return flag;
    }

    public static void main(String[] args){
        String input = "RENTNOW";
        String result = findPolindrome(input);
        System.out.println(result);
    }
}