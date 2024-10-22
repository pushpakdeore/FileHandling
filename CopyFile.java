package pushpak55filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile  {
    public static void main(String[] args)  throws IOException {
        FileInputStream r = new FileInputStream("C:\\Users\\PUSHPAK\\Desktop\\filehandling\\akash.txt");  // read only
        FileOutputStream w =new FileOutputStream("C:\\Users\\PUSHPAK\\Desktop\\filehandling\\pushpak1235.txt");//create new file and write
        int i;
        while ((i =r.read()) !=-1){
            w.write((char)i);
        }
        System.out.println("file data is copied .");

    }
}
