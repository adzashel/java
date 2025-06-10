import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai a =  ");
        int a = input.nextInt();
        System.out.println("Masukan Nilai b =  ");
        int b = input.nextInt();
        int result = 1;
        for(int i = 1; i <= b; i++){
            result *= a;
        }
        System.out.println("Hasil = " + result);
        input.close();
    }
}
