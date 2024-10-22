package pushpak55filehandling;

import java.io.* ;
import java.io.IOException;

public class creatFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\PUSHPAK\\Desktop\\filehandling\\LC.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File successfully created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred during file creation.");
            e.printStackTrace();
        }

        //inforamtion of file

        if(f.exists()) {
            System.out.println("File name :"+f.getName());
            System.out.println("File Location :"+f.getAbsolutePath());
            System.out.println("File Writable :"+f.canWrite());
            System.out.println("file Readable: "+f.canWrite());
            System.out.println("file size :"+ f.length());

        }else {
            System.out.println("FIle doesn't Exists >");
        }


//        write operation in file
        try{
            FileWriter f1 =new FileWriter("C:\\Users\\PUSHPAK\\Desktop\\filehandling\\LC.txt");
            try{
                f1.write("java progrmming");
            }finally {
                f1.close();
            }
            System.out.println("succesfuly wrote in file");


        }catch (IOException e){
            System.out.println(e);
        }

        //FILE read
        try {
            FileReader f3 =new FileReader("C:\\Users\\PUSHPAK\\Desktop\\filehandling\\LC.txt");
            try {
                int i;
                while ((i=f3.read())!=-1){
                    System.out.print((char) i);

                }
            }
            finally {
                f3.close();
            }
        }catch (IOException e){
            System.out.println("Exception  handale .. ");
        }
    }





}
