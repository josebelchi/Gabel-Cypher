package main.java.cifrado;

import java.util.Scanner;

public class Console {
    private static Console instancia;
    private final Scanner input;

    private Console(){
        this.input = new Scanner(System.in);
    }

    public static Console getInstance() {
        if (instancia == null)
            instancia = new Console();

        return instancia;
    }

    public void println(String message) {
        System.out.println(message);
    }
    public void print(String message) {
        System.out.println(message);
    }

    public String read(){
        return this.input.nextLine();
    }
}