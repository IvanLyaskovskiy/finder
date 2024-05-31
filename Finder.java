package com.lessons;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Finder {
    public static void main(String[] args) {
        String filePath = "key.txt";
        String keyword = "key";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean found = false;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(keyword)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Слово '" + keyword + "' знайдено в файлі.");
            } else {
                System.out.println("Слово '" + keyword + "' не знайдено в файлі.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено.");
        } catch (IOException e) {
            System.out.println("Помилка при читанні файлу.");
        }
    }
}
