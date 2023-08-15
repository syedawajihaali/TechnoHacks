import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Random Password Generator");
        System.out.println("=========================");
        System.out.println("Enter the desired length of your password:");
        int length = s.nextInt();
        s.nextLine();
        System.out.println("Do you want to include lowercase letters? (y/n): ");
        boolean lowercase = s.nextLine().equalsIgnoreCase("y");
        System.out.println("Do you want to include uppercase letters? (y/n): ");
        boolean uppercase = s.nextLine().equalsIgnoreCase("y");
        System.out.println("Do you want to include digits? (y/n): ");
        boolean digits = s.nextLine().equalsIgnoreCase("y");
        System.out.println("Do you want to include special characters? (y/n): ");
        boolean specialch = s.nextLine().equalsIgnoreCase("y");
        String password = generate(length, lowercase, uppercase, digits, specialch);
        System.out.println("Randomly Generated Password: "+password);
        s.close();
    }
    public static String generate(int length, boolean lowercase, boolean uppercase, boolean digits, boolean specialch){
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digitChars = "0123456789";
        String specialChars = "!@#$%^&*()_-+=<>?";

        String allChars = "";
        if (lowercase) {
            allChars += lowercaseChars;
        }
        if (uppercase) {
            allChars += uppercaseChars;
        }
        if (digits) {
            allChars += digitChars;
        }
        if (specialch) {
            allChars += specialChars;
        }

        Random random = new Random();
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allChars.length());
            password[i] = allChars.charAt(randomIndex);
        }

        return new String(password);
    }
}
