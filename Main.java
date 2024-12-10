import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        System.out.print("Введите число сдвига: ");
        int shift = scanner.nextInt();

        System.out.print("Выберите действие: 1-шифровать или 2-дешифровать: ");
        int choice = scanner.nextInt();

        CaesarCipher cipher;

        if (choice == 1) {
            cipher = new Encryptor(shift);
            System.out.println("Зашифрованный текст: " + cipher.processText(text));
        } else if (choice == 2) {
            cipher = new Decryptor(shift);
            System.out.println("Расшифрованный текст: " + cipher.processText(text));
        } else {
            System.out.println("Неверный текст выберите 1 или 2");
        }

        scanner.close();
    }
}