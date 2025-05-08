import  java.io.*;

public  class Main {
    public static void main(String[] args) throws  IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader rl = new BufferedReader(input);

        System.out.print("Masukkan jumlah menit: ");
        long minute = Integer.parseInt(rl.readLine());

        long toHour = minute / 60;
        long toDay = toHour / 24;
        long hourRemainder = toHour % 24;
        long year = 365;
        long toYear = toDay / year;
        long yearRemainder = toDay % year; // cari sisa hari setelah 1 thn
        // output year day

        System.out.println("\nKonversi waktu:");
        System.out.println(minute + " menit =  ");
        System.out.println(toYear + " tahun " +  " dan " +  yearRemainder + " Hari " + hourRemainder +  " jam ");
        // tahun dan hari
    }
}