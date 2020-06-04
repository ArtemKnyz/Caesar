package Logic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Logic {

    //produce decripted text
    public void produceDecriptedMessage(List<String> secretText, List<String> rusAlphabit, int step) {
        List<String> decriptedText = new ArrayList<>();
        for (int i = 0; i < secretText.size(); i++) {
            if (secretText.get(i).matches("[\\s\\,\\.]")) {
                decriptedText.add(secretText.get(i));
                continue;
            }
            for (int j = 0; j < rusAlphabit.size(); j++) {
                if (secretText.get(i).equalsIgnoreCase(rusAlphabit.get(j))) {
                    if (checkUppercase(secretText.get(i).toCharArray()[0])) {
                        if ((j - step) < 0) {
                            j = 33 + j;
                            decriptedText.add(rusAlphabit.get(j - step).toUpperCase());
                            j = j - 33;
                        } else {
                            decriptedText.add(rusAlphabit.get(j - step).toUpperCase());
                        }
                    } else {
                        if ((j - step) < 0) {
                            j = 33 + j;
                            decriptedText.add(rusAlphabit.get(j - step));
                            j = j - 33;
                        } else {
                            decriptedText.add(rusAlphabit.get(j - step));
                        }
                    }
                    break;
                }
            }
        }
        decriptedText.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s);
            }
        });
    }

    boolean checkUppercase(char ch) {
        boolean s = false;
        if (Character.isUpperCase(ch)) {
            s = true;
        }
        return s;
    }
}