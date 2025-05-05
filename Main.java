import  java.util.Scanner;


public class Main  {
    public static  void  main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan berapa lama parkir = ");
        int time = input.nextInt();
        int fee ;
        if(time < 2 ) {
            fee = 3000;
            System.out.print("Biaya parkir = " + fee);
        }else if( time > 2 ) {
            fee = 3000 + ( time - 2 ) * 2000;
            System.out.print("Biaya parkir = " + fee);
        }else {
            System.out.print("Input salah");
        }
    }
}