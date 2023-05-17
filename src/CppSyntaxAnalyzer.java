/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author chech
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CppSyntaxAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la declaración de variable en C++ y el código en C++ (puedes usar varias líneas).");
        System.out.println("Presiona Enter en una línea vacía para finalizar:");

        StringBuilder inputBuilder = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            inputBuilder.append(line).append("\n");
        }
        String input = inputBuilder.toString();

        HashMap<String, String> tokenTable = new HashMap<>();
        List<String> wordsList = new ArrayList<>();

        String[] lines = input.split("\n");
        int row = 1;

        for (int i = 0; i < lines.length; i++) {
            String linez = lines[i];
            String[] tokens = linez.split(" ");
            int column = 1;

            for (int j = 0; j < tokens.length; j++) {
                String token = tokens[j];

                if (!token.isEmpty()) {
                    tokenTable.put(token, "(" + row + ", " + column + ")");
                    wordsList.add(token);
                    column += token.length() + 1; // +1 for the space
                }
            }

            row++;
        }

        // Print the list of words and their tokens
        System.out.println("\nLista de Palabras y Tokens:");
        for (String word : wordsList) {
            System.out.println("Palabra: " + word + ", Token: " + tokenTable.get(word));
        }

        System.out.print("\nIngresa el token a buscar: ");
        String tokenToSearch = scanner.nextLine();
        String tokenPosition = tokenTable.get(tokenToSearch);

        if (tokenPosition != null) {
            System.out.println("El token '" + tokenToSearch + "' se encuentra en la posición: " + tokenPosition);
        } else {
            System.out.println("El token '" + tokenToSearch + "' no se encontró en la lista de palabras.");
        }
    }
}
