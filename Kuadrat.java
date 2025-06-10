import java.util.Scanner;
public class Kuadrat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai n =  ");
        int n = input.nextInt();
        int result = 0;
        int total = 0;
        for(int i = 1; i <= n; i++){
            result = i * i;
            total += result;
            System.out.print( result + " ");
        }
        System.out.println();
            System.out.println("Total = " + total);
        input.close();
    }
}
