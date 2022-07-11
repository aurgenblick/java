package javaLabs.task10;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;

public class lesson10 {

    public static void main(String[] args) {
        File file1 = new File("files/text.txt");
        File file2 = new File("output.txt");

//        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
//            String input;
//            while ((input = reader.readLine()) != null)
//                System.out.println(input);
//
//        } catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//
//        InputStream is = null;
//        OutputStream os = null;
//
//        try {
//            is = new FileInputStream(file1);
//            os = new FileOutputStream(file2);
//
//            while (is.available() > 0) {
//                os.write(is.read());
//            }
//        } catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        } finally {
//            try {
//                if(is != null) {
//                    is.close();
//                }
//
//                if(os != null) {
//                    os.close();
//                }
//            } catch (IOException e) {
//                System.out.println("Error: " + e.getMessage());
//            }
//        }
//
        Path path = Paths.get("/Users/user/Documents");
//        File[] files = path.toFile().listFiles();
//
//        if(files != null) {
//            for (File file : files) {
//                System.out.println(file.getName());
//            }
//        }

        System.out.println(new DecimalFormat("#")
                .format(path.toFile().getTotalSpace() / 1000000000.0) + "GB");


//        public static void writeData(List<String> stringList) {
//            try(BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt"))) {
//                for (String s : stringList) {
//                    writer.write("Hello!");
//                }
//            }
//        }

//

    }
}
