import system.Console;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        system.Console console = new Console();

        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("Ошибка: не передан аргумент! Укажите имя файла.");
            }

            String fileName = args[0];

            File file = new File(fileName);
            if (!file.exists() || !file.isFile()) {
                throw new FileNotFoundException("Ошибка: файл '" + fileName + "' не найден.");
            }

            if (file.length() == 0) {
                throw new IOException("Ошибка: файл '" + fileName + "' пуст.");
            }

            System.out.println("Файл '" + fileName + "' успешно загружен.");
            processFile(file);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Непредвиденная ошибка: " + e.getMessage());
        }
        console.start(args[0]);
    }

    private static void processFile(File file) {
        System.out.println("Обработка файла...");
    }
}