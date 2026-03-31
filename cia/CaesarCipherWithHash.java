import java.util.*;

public class CaesarCipherWithHash {

    // -------- Hash Function --------
    public static int generateKey(String text) {
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            sum += text.charAt(i);
        }

        return sum % 26;
    }

    // -------- Encryption --------
    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                result.append((char) ((ch - 'A' + key) % 26 + 'A'));
            }
            else if (Character.isLowerCase(ch)) {
                result.append((char) ((ch - 'a' + key) % 26 + 'a'));
            }
            else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    // -------- Decryption --------
    public static String decrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                result.append((char) ((ch - 'A' - key + 26) % 26 + 'A'));
            }
            else if (Character.isLowerCase(ch)) {
                result.append((char) ((ch - 'a' - key + 26) % 26 + 'a'));
            }
            else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    // -------- Main --------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Encryption");
        System.out.println("2. Decryption");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Enter Plain Text: ");
                String plainText = sc.nextLine();

                int key = generateKey(plainText);
                System.out.println("Generated Key (Hash): " + key);

                String cipherText = encrypt(plainText, key);
                System.out.println("Encrypted Text: " + cipherText);

                System.out.println("NOTE: Save this key for decryption!");
                break;

            case 2:
                System.out.print("Enter Cipher Text: ");
                String cipher = sc.nextLine();

                System.out.print("Enter Key used during encryption: ");
                int userKey = sc.nextInt();

                String decrypted = decrypt(cipher, userKey);
                System.out.println("Decrypted Text: " + decrypted);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}