import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        int benar = 0 , salah = 0;

        for(int i = 1; i <= 5 ; i++) {
            int a = rd.nextInt(20), b = rd.nextInt(19) + 1;
            int operator = rd.nextInt(4), result = 0, answer = 0;
            char symbol = '?';
            if (operator == 0) {
                result = a + b;
                symbol = '+';
            } else if (operator == 1) {
                result = a * b;
                symbol = 'x';
            } else if (operator == 2) {
                result = a - b;
                symbol = '-';
            } else {
                result = a / b;
                symbol = ':';
            }

            System.out.print("Soal ke " + i + "=> " + a + symbol + b + '=');
            answer = input.nextInt();

            System.out.print(answer == result ? "Benar" : "Salah"+ "\n");


            if (answer == result) {
                benar++;
            } else {
                salah++;
            }
            System.out.print("benar = " + benar + "\n" + "salah = " + salah + "\n");
        }
    }
}
