import java.util.Scanner;

public class Sulthan_1491Fibonnaci {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);

        System.out.print("Masukan angka = ");
        int number = inpt.nextInt();
        int a = 0 , b = 1 , count = 0;


        FindFibonacciSequence(a , b , count , number);
        inpt.close();
    }

   public static void FindFibonacciSequence(int a , int b , int count , int number) {
        int total = 0;
        while (count < number) {
            System.out.print(a + " ");
            total += a;
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
        System.out.println();
        System.out.println("Total = " + total);
    }
}
