package io;

import java.io.*;

public class FileProcessor {

    public static void processFile() {
        try (
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }
            System.out.println("File processed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
