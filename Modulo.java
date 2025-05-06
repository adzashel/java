import  java.io.BufferedReader;
import  java.io.InputStreamReader;
import  java.io.IOException;

public  class Modulo  {
    public static void  handleModulo(int number) {
        int moduloBy4 = number % 4;
        int moduloBy5 = number % 5;

        if(moduloBy5 == 0 && moduloBy4 == 0) {
            System.out.println(number + "Dapat dibagi oleh angka 4 dan 5");
        }else if( moduloBy4 == 0 || moduloBy5 == 0) {
            System.out.println(number + " Dapat dibagi oleh salah satunya , tetapi tidak keduanya");
        }else {
            System.out.println(number + " Tidak dapat dibagi oleh keduanya");
        }
    }
    public  static  void  main(String[] args) throws  IOException {
        InputStreamReader inpt = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inpt);

        // masukan angka
        System.out.print("Masukan sebuah angka = ");
        int number = Integer.parseInt(br.readLine());  // parsing to integer
        handleModulo(number);
    }
}