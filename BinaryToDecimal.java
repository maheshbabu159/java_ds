public class BinaryToDecimal{
    static int convertDecimalToOctal(int decimal) {
        int octalNumber = 0, i = 1;
        while (decimal != 0) {
            octalNumber += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }
        return octalNumber;
    }
    static int binaryToDecimal(String binary){
        int conversion = 1;
        int result = 0;
        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1')
                result += conversion;
            conversion *= 2;
        }
        return result;
    }
    public static void main(String[] args){
        String binary = "10110";
        System.out.println(binaryToDecimal(binary));
        System.out.println(convertDecimalToOctal(78));

    }
}