package employee.management;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    // Lukee tiedoston rivit ja palauttaa listan
    public static ArrayList<String> readFile(String fileName) {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Virhe tiedostoa luettaessa: " + e.getMessage());
        }
        return lines;
    }

    // Kirjoittaa listan tiedostoon, yksi rivi per lista-elementti
    public static void writeFile(String fileName, ArrayList<String> lines) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Virhe tiedostoon kirjoittaessa: " + e.getMessage());
        }
    }
}
