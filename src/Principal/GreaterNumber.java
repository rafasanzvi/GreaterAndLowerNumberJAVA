package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreaterNumber {

    public static void main(String[] args) throws IOException{

        InputStreamReader getInput = new InputStreamReader(System.in);
        BufferedReader readerTheInputs = new BufferedReader(getInput);

        System.out.println("Write the first number: ");
        String strNumber1 = readerTheInputs.readLine();
        Integer number1 = Integer.parseInt(strNumber1);

        System.out.println("Write the second number: ");
        String strNumber2 = readerTheInputs.readLine();
        Integer number2 = Integer.parseInt(strNumber2);

        System.out.println("Write the third number: ");
        String strNumber3 = readerTheInputs.readLine();
        Integer number3 = Integer.parseInt(strNumber3);

        calculateGreaterNumber(number1, number2, number3);
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
