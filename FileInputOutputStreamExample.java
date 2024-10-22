package pushpak55filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamExample {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\PUSHPAK\\Desktop\\filehandling\\kuanl.txt");
             FileOutputStream fos = new FileOutputStream("C:\\Users\\PUSHPAK\\Desktop\\filehandling\\LC1.txt")) {//try with resource

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully using FileInputStream and FileOutputStream.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
