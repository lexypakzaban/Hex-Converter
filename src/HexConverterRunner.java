import java.util.Scanner;

public class HexConverterRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimal = input.nextInt();

        System.out.println(convert(decimal));
    }

    public static String convert (int decimal){
        String[] hexArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        String result = "";

        if (decimal < 16){
            result += hexArray[decimal];
        }

        else {
            int remainder = decimal%16;
            result += convert(decimal/16) + hexArray[remainder];
        }


        return result;

    }
}
