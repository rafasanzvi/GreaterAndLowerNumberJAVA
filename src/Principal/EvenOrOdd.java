package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOrOdd {

    public static void main(String[] args) throws IOException {

        System.out.println("Write a number please");
        Integer numberFromUser = getNumber();

        //Another way, maybe more complicated
        /*
        To convert this number in decimal
        Double numberFromUser = Double.valueOf(getNumber());
        Boolean isEven = (number / 2) == Math.round(number / 2);

        if(isEven) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        */
        evenOrOdd(numberFromUser);
    }

    private static Integer getNumber() throws IOException {

        InputStreamReader getInputNumber = new InputStreamReader(System.in);
        BufferedReader readerGetInputNumber = new BufferedReader(getInputNumber);

        String strNumber = readerGetInputNumber.readLine();
        Integer number = Integer.parseInt(strNumber);

        return number;
    }

    private static Integer evenOrOdd(Integer number) {

        if(number % 2 == 0) {
            System.out.println("The number: " + number + "is Even");
        } else if(number % 2 == 1) {
            System.out.println("The number: " + number + "is Odd");
        } else {
            System.out.println("The number is not correct");
        }
        return number;
    }

}
