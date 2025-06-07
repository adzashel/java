import java.util.Scanner;

public class Sulthan_1491 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input angka = ");
        int number = input.nextInt();

        int i = 1;
        while(i <= number) {
            if(number % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        input.close();
    }
}
