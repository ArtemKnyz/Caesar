import Logic.Logic;

import java.io.IOException;

public class Main {
    int value;
    static Alphabet text = new Alphabet();
    static Logic log = new Logic();

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("Зашифрованный текст: " + text.secretMessage);
        Main m = new Main();
        m.getDecryptedMessages();
    }

    void getDecryptedMessages() {
        for (int i = 1; i < text.rusAlphabet.length; i++) {
            System.out.print("Вариант шифровки " + i + ": ");
            log.produceDecriptedMessage(text.secretMessageToList(text.secretMessage)
                    , text.rusAlphabitToList(text.rusAlphabet)
                    , i);
            System.out.println("");
        }
    }
}
