package javaLabs.task10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    /**
     * 1.	Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
     */
    //вариант с Files.readAllLines
    private static List<String> readLinesIntoSet1() {
        System.out.println("Enter path to a text file :");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        List<String> fileLines = new ArrayList<>();
        try {
            fileLines = Files.readAllLines(Paths.get(path));
            for (String line : fileLines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileLines;
    }

    //перегрузка сразу с path
    private static List<String> readLinesIntoSet1(String path) {
        List<String> fileLines = null;
        new ArrayList<>();
        try {
            fileLines = Files.readAllLines(Paths.get(path));
            for (String line : fileLines) {
                System.out.println(line);
            }
            return Files.readAllLines(Paths.get(path));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileLines;
    }

    //вариант с RandomAccessFile
    private static void readLinesIntoSet2(String path) {
        try (RandomAccessFile myFile = new RandomAccessFile(path, "rws"))//открываем в синхронизированном rw режиме ; если открываем только для чтения, то "r"
        {
            String fileStr;
            while ((fileStr = myFile.readLine()) != null) {
                System.out.println(fileStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }//AutoCloseable, поэтому можно не закрывать поток
    }

    //вариант с OutputStream
    private static void readLinesIntoSet3(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String input;
            while ((input = reader.readLine()) != null)
                System.out.println(input);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    /**
     * 2.	Написать метод, который записывает в файл строку, переданную параметром.
     */
    private static void writeToFile(String inpt) {
        System.out.println("Enter path to a text file :");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        if (Files.isWritable(Path.of(path))) {
            try (FileWriter writer = new FileWriter(path, true)) {
                writer.write(inpt);
                writer.flush();
            } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }

    //перегрузка срау с path
    private static void writeToFile(String inpt, String path) {
        if (Files.isWritable(Path.of(path))) {
            try (FileWriter writer = new FileWriter(path, true)) {
                writer.write(inpt);
                writer.flush();
            } catch (IOException ex) {
            }
        }
    }


    /**
     * 3.	Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.
     */
    //вариант с IO Stream
    private static void joinFiles(String path1, String path2) {
        File joinedFiles = new File("C:\\Users\\user\\IdeaProjects\\java\\src\\org\\itmo\\java\\labs\\task10\\joinedFiles.txt");
        InputStream is1 = null;
        InputStream is2 = null;
        OutputStream os = null;

        try {
            is1 = new FileInputStream(path1);
            os = new FileOutputStream(joinedFiles);

            while (is1.available() > 0) {
                os.write(is1.read());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (is1 != null) {
                    is1.close();
                }

                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    //вариант с FileWriter
    private static void mergeFiles (String path1, String path2) {
        try(FileWriter writer = new FileWriter("C:\\Users\\user\\IdeaProjects\\java\\src\\org\\itmo\\java\\labs\\task10\\mergedFiles.txt", true))
        {
            List<String> file1 = readLinesIntoSet1(path1);
            List<String> file2 = readLinesIntoSet1(path2);

            //построчная запись коллекции, созданной из строк первого файла
            for (String s1 : file1) {
                writer.append(s1);
                writer.flush();
            }
            for (String s2: file2) {
                writer.append(s2);
                writer.flush();
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }


    /**
     * 4.	Написать метод который заменяет в файле все кроме букв и цифр на знак ‘$’
     */

    private static String replaceChars (String path) throws FileNotFoundException {
        List<String> strings = readLinesIntoSet1(path);
        StringBuilder newString = new StringBuilder();
        for (String s : strings) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetterOrDigit(s.charAt(i))) {
                    newString.append(s.charAt(i));
                } else {
                    newString.append("$");
                }
            }
        }
        return newString.toString();
    }

    public static void main(String[] args) throws FileNotFoundException {
        String path1 = "C:\\Users\\user\\IdeaProjects\\java\\src\\org\\itmo\\java\\labs\\task10\\test1.txt";
        String path2 = "C:\\Users\\user\\IdeaProjects\\java\\src\\org\\itmo\\java\\labs\\task10\\test2.txt";

        /**1.	Написать метод, который читает текстовый файл и возвращает его в виде списка строк.*/
        //читаем первым методом (Files.readAllLines)
        System.out.println("Reading file as a list of strings:");
        List fileLn = readLinesIntoSet1(path1);
        System.out.println(fileLn.toString());
        /** 2.	Написать метод, который записывает в файл строку, переданную параметром.*/
        //записываем строку методом, использующим FileReader
        writeToFile("one more line", path1);
        //читаем вторым методом (RandomAccessFile)
        System.out.println("Reading the written file string after string via RandomAccessFile");
        readLinesIntoSet2(path1);
        //читаем и выводим третьим методом (OutputStream)
        System.out.println("Reading the written file string after string via OutputStream");
        readLinesIntoSet3(path1);
        /**3.	Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.*/
        //соединяем файлы
        joinFiles(path1, path2);
        mergeFiles(path1, path2);
        //выводим получившийся файл с помощью метода из прошлого задания
        System.out.println("Третье задание");
        System.out.println("Соединение через OutputStream");
        readLinesIntoSet2("C:\\Users\\user\\IdeaProjects\\java\\src\\org\\itmo\\java\\labs\\task10\\joinedFiles.txt");
        System.out.println("Соединение через FileWriter");
        readLinesIntoSet2("C:\\Users\\user\\IdeaProjects\\java\\src\\org\\itmo\\java\\labs\\task10\\mergedFiles.txt");
        System.out.println("Четвертое задание");
        System.out.println(replaceChars("C:\\Users\\user\\IdeaProjects\\java\\src\\org\\itmo\\java\\labs\\task10\\mergedFiles.txt"));

    }
}
