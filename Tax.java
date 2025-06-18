import java.util.Scanner;

public class Tax {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih Kategori = \n 1. Tidak Kawin \n 2.Kawin ");
        System.out.println("Input Kategori = ");
        int option = input.nextInt();
        System.out.println("Masukan pendapatan anda = ");
        long salary = input.nextLong();

        // use nested if to determine the tax should user pay
        extracted(option, salary);
        input.close();
    }
    public static void extracted(int option, long salary) {
        if(option == 1) {
            if(salary <= 70000000) {
                double tax = 0.05;
                double total = salary * tax;

                System.out.println("Pajak yang harus dibayar = " + total );
            }else if(salary <= 270000000){
                double tax = 0.15;
                double total = salary * tax;
                int totalPay = (int) total;
                System.out.println("Pajak yang harus dibayar = " + totalPay);
            }else {
                double tax = 0.25;
                System.out.println("Pajak yang harus dibayar = " + salary * tax);
            }
        }else if(option == 2) {
            if(salary <= 50000000) {
                double tax = 0.05;
                System.out.println("Pajak yang harus dibayar = " + salary * tax);
            }else if(salary <= 250000000){
                double tax = 0.15;
                System.out.println("Pajak yang harus dibayar = " + salary * tax);
            }else{
                double tax = 0.25;
                System.out.println("Pajak yang harus dibayar = " + salary * tax);
            }
        }else {
            System.out.println("Invalid");
        }
    }
}
