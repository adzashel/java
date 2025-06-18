import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        // find vowel in string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // use switch case to check if the character is a vowel
            switch (c) {
                case 'a':
                case 'i':
                case 'u':
                case 'e':
                case 'o':
                    vowelCount++;
                    break;
                default:
                    consonantCount++;
                    break;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        input.close();
    }
}