package main.java.cifrado;

import java.text.Normalizer;

public class Gabel {
    private final Console console;

    public Gabel() {
        this.console = Console.getInstance();
    }

    public void gabelCypher() { // does not support 'ñ'
        String phrase;
        console.println("-=-=-=- SISTEMA DE CIFRADO GABEL -=-=-=-");

        do {
            console.print("¿Desea cifrar una frase, descifrar una frase o terminar? (\"CIFRAR\", \"DESCIFRAR\" o \"TERMINAR\"): ");
            phrase = console.read();
            console.println(""); //

            if (!phrase.equalsIgnoreCase("TERMINAR")) {
                if (phrase.equalsIgnoreCase("CIFRAR")) {
                    console.println("Introduzca la frase a cifrar: ");
                    phrase = console.read();

                    if (!phrase.isEmpty()) console.print("Frase cifrada:\n" + cypher(phrase) + "\n");
                    else console.println("No se ha introducido ninguna frase.\n");
                }
                if (phrase.equalsIgnoreCase("DESCIFRAR")) {
                    console.println("Introduzca la frase a descifrar: ");
                    phrase = console.read();

                    if (!phrase.isEmpty()) console.print("Frase descifrada:\n" + decypher(phrase) + "\n");
                    else console.println("No se ha introducido ninguna frase.\n");
                }
            }
        } while (!phrase.equalsIgnoreCase("TERMINAR"));

        console.println("Adiós.");
    }


    public String normalize(String text) { // we get rid of accents
        return Normalizer.normalize(text, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
    }


    public String cypher(String phrase) {
        String normalizedPhrase = normalize(phrase);
        StringBuilder cypheredPhrase = new StringBuilder();
        String[] words = normalizedPhrase.split(" ", -1); // -1 to avoid more than 1 blank space per phrase
        int wordCounter = 0;

        for (String word : words) {
            if (wordCounter != 0)
                cypheredPhrase.append(" ");

            for (int j = 0; j < word.length(); j++) {
                char currentChar = word.charAt(j);
                char loweredChar = Character.toLowerCase(currentChar);

                if (Character.isLetter(loweredChar)) {
                    if (loweredChar == 'a' || loweredChar == 'b' || loweredChar == 'c') {
                        cypheredPhrase.append((char) (currentChar - 3 + 26)); // regresses adjusting its character
                    } else {
                        cypheredPhrase.append((char) (currentChar - 3));
                    }

                    if (++j < word.length()) { // to avoid IndexOutOfBoundsException || StringIndexOutOfBoundsException
                        currentChar = word.charAt(j);
                        cypheredPhrase.append(currentChar);
                    }
                } else {
                    cypheredPhrase.append(currentChar);
                }
            }
            wordCounter++;
        }

        return cypheredPhrase.toString();
    }

    public String decypher (String phrase) {
        String normalizedPhrase = normalize(phrase);
        StringBuilder decypheredPhrase = new StringBuilder();
        String[] words = normalizedPhrase.split(" ", -1);
        int wordCounter = 0;

        for (String word : words) {
            if (wordCounter != 0) {
                decypheredPhrase.append(" ");
            }

            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                char loweredChar = Character.toLowerCase(currentChar);

                if (Character.isLetter(loweredChar)) {
                    if (loweredChar == 'x' || loweredChar == 'y' || loweredChar == 'z') {
                        decypheredPhrase.append((char) (currentChar + 3 - 26));
                    } else {
                        decypheredPhrase.append((char) (currentChar + 3));
                    }

                    if (++i < word.length()) { // moves on to the next odd position (check if it is the same with i++)
                        currentChar = word.charAt(i);
                        decypheredPhrase.append(currentChar);
                    }
                } else {
                    decypheredPhrase.append(currentChar);
                }
            }
            wordCounter++;
        }

        return decypheredPhrase.toString();
    }
}