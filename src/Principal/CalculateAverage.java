package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateAverage {

    public static void main(String[] args) throws IOException {

        System.out.println("Write the first number");
        Integer number1 = chargeNumber();

        System.out.println("Write the second number");
        Integer number2 = chargeNumber();

        System.out.println("Write the third number");
        Integer number3 = chargeNumber();

        calculateAverage(number1, number2, number3);
        /*
        We can calculate directly, or using the way above

        Integer sum = number1 + number2 + number3;
        Double averageNumber = Double.valueOf(sum) / 3;

        System.out.println("The average between the three numbers is: " + averageNumber);

        */
    }

    private static Integer chargeNumber() throws IOException {
        InputStreamReader getInputNumber = new InputStreamReader(System.in);
        BufferedReader readerGetInputNumber = new BufferedReader(getInputNumber);

        String strNumber = readerGetInputNumber.readLine();
        Integer number = Integer.parseInt(strNumber);

        return number;
    }


    private static Double calculateAverage(Integer number1, Integer number2, Integer number3) {

        Integer sum = (number1 + number2 + number3);
        Double averageNumber = Double.valueOf(sum) / 3;

        System.out.println("The average between the three numbers is: " + averageNumber);

        return averageNumber;
    }

}
