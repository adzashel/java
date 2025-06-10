import java.util.Scanner;

public class Sulthan_1491FlipFlop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Angka =");

        int maxValue = input.nextInt();
        int i = 1;
        while (i <= maxValue) {
            String output =
                    ((i % 3 == 0) && (i % 5 == 0)) ? "Eureka" :
                    (i % 3 == 0) ? "Flip" :
                            (i % 5 == 0) ? "Flop" :
                                    String.valueOf(i);
            System.out.print(output + " ");
            i++;
        }
        input.close();
        }
        

    }



