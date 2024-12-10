import java.util.Scanner;

abstract class CaesarCipher {
    protected int shift;

    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    public abstract String processText(String text);
}

class Encryptor extends CaesarCipher {
    public Encryptor(int shift) {
        super(shift);
    }

    @Override
    public String processText(String text) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                encrypted.append((char) ((c - base + shift) % 26 + base));
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }
}

class Decryptor extends CaesarCipher {
    public Decryptor(int shift) {
        super(shift);
    }

    @Override
    public String processText(String text) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                decrypted.append((char) ((c - base - shift + 26) % 26 + base));
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }
}



