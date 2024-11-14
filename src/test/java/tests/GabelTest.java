package test.java.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.java.cifrado.Gabel;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GabelTest {
    private Gabel gabel;

    @BeforeEach
    void setUp() {
        gabel = new Gabel();
    }

    @Test
    void testCypherSimplePhrase() {
        String phrase = "Hola Mundo";
        String expected = "Eoia Jukdl";
        String result = gabel.cypher(phrase);
        assertEquals(expected, result, "La frase cifrada no coincide con el resultado esperado.");
    }

    @Test
    void testCypherWithSpecialCharacters() {
        String phrase = "Cifrado con !@# caracteres.";
        String expected = "Zicrxdl zok !@# zaoaztbrbs.";
        String result = gabel.cypher(phrase);
        assertEquals(expected, result, "La frase cifrada con caracteres especiales no coincide.");
    }

    @Test
    void testCypherWithAccents() {
        String phrase = "Hólà Mundó";
        String expected = "Eoia Jukdl"; // La normalización debe quitar tildes antes de cifrar
        String result = gabel.cypher(phrase);
        assertEquals(expected, result, "La frase cifrada con tildes no coincide.");
    }

    @Test
    void testDecypherSimplePhrase() {
        String phrase = "Eoia Jukdl";
        String expected = "Hola Mundo";
        String result = gabel.decypher(phrase);
        assertEquals(expected, result, "La frase descifrada no coincide con el resultado original.");
    }

    @Test
    void testDecypherWithSpecialCharacters() {
        String phrase = "Zicrxdl zok !@# zaoaztbrbs.";
        String expected = "Cifrado con !@# caracteres.";
        String result = gabel.decypher(phrase);
        assertEquals(expected, result, "La frase descifrada con caracteres especiales no coincide.");
    }

    @Test
    void testNormalizeRemovesAccents() {
        String phrase = "Árbol, finjí, café";
        String expected = "Arbol, finji, cafe";
        String result = gabel.normalize(phrase);
        assertEquals(expected, result, "El método \"normalize\" no elimina correctamente las tildes.");
    }
}