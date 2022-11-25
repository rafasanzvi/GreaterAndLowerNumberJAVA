package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreaterNumber {

    public static void main(String[] args) throws IOException{

        System.out.println("Write the first number: ");
        Integer number1 = chargeNumber();

        System.out.println("Write the second number: ");
        Integer number2 = chargeNumber();

        System.out.println("Write the third number: ");
        Integer number3 = chargeNumber();

        calculateGreaterNumber(number1, number2, number3);
        calculateLowerNumber(number1, number2, number3);
    }

    private static Integer chargeNumber() throws IOException {
        InputStreamReader getInput = new InputStreamReader(System.in);
        BufferedReader readerTheInputs = new BufferedReader(getInput);

        String strNumber1 = readerTheInputs.readLine();
        Integer number = Integer.parseInt(strNumber1);

        return number;
    }

    private static void calculateGreaterNumber(Integer number1, Integer number2, Integer number3) {
        Integer greaterNumber = number1;

        if (number2 > greaterNumber) {
            greaterNumber = number2;
        }
        if (number3 > greaterNumber) {
            greaterNumber = number3;
        }

        System.out.println("The greater number is: " + greaterNumber);

    }

    private static void calculateLowerNumber(Integer number1, Integer number2, Integer number3) {

        Integer lowerNumber = number1;

        if (number2 < lowerNumber) {
            lowerNumber = number2;
        }
        if (number3 < lowerNumber) {
            lowerNumber = number3;
        }

        System.out.println("The lower number is: " + lowerNumber);
    }

}
