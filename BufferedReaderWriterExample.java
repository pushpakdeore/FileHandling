package pushpak55filehandling;
import java.io.*;
public class BufferedReaderWriterExample {
    public static void main(String[] args) throws  IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\PUSHPAK\\Desktop\\filehandling\\kuanl.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\PUSHPAK\\Desktop\\filehandling\\snehal.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File copied successfully using BufferedReader and BufferedWriter.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
