import java.util.Scanner;


public class Index {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter total volume = ");
            int volume = input.nextInt(); // initial volume

            // big bottle
            int bigBottle = 1500; // 1500ml
            int remainingVol = volume % bigBottle; // 450
            int quotientBigBottle = FindQuotient( volume , remainingVol , bigBottle);

            System.out.println("Big Bottle = "  + quotientBigBottle);

            // Medium bottle 
            int mediumBottle = 600; // 600ml
            remainingVol = remainingVol % mediumBottle; // 450 % 600 = 0 R450 || 0 = 450 - 450 / 600
            int quotientMedBottle = FindQuotient(remainingVol , remainingVol , mediumBottle);
            System.out.println("Medium Bottle = " + quotientMedBottle);

            // Small Bottle 
            int smallBottle = 330; // 330 ml
            int remainVol = remainingVol; 
            int remainingVolume = remainVol % smallBottle;// 450 % 330 = 1 R 120 || 1 = 450 - 120 / 330
            int quotientSmallBottle = FindQuotient(remainVol, remainingVolume, smallBottle);
            System.out.println("Small Bottle = " + quotientSmallBottle);

            // Mini Bottle 
            int miniBottle = 240;  
            remainingVolume = remainingVolume % miniBottle; // 120 % 240 = 0 R120   0 = 120- 120 / 240
            int quotientMiniBOttle = FindQuotient( remainingVolume , remainingVolume , miniBottle);
            System.out.println("Mini Bottle = " + quotientMiniBOttle);

            System.out.println("Water remaining that cannot put into the bottle = " + remainingVolume);
        }
    }


    // class to find quotient
    public static int FindQuotient(int divident , int remainder , int divisor) {
        int quotient = ( divident - remainder)/ divisor;
        return quotient;
    }

  
}