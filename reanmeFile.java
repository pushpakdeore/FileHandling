package pushpak55filehandling;

import java.io.File;

public class reanmeFile {
    public static void main(String[] args) {
        File f =new File("C:\\Users\\PUSHPAK\\Desktop\\filehandling\\LC.txt");
        File r =new File("C:\\Users\\PUSHPAK\\Desktop\\filehandling\\kuanl.txt");

        if(f.exists()){
            System.out.println(f.renameTo(r));

        }else {
            System.out.println("file doesn't exist "
            );
        }

    }
}
