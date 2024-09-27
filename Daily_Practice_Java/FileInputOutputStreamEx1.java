package Daily_Practice_Java;

import java.io.*;

public class FileInputOutputStreamEx1 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("checkFileInput/new.txt");
            FileOutputStream fout = new FileOutputStream("checkFileInput/new2.txt");

            int b;

            while ((b = fin.read()) != -1) {
                fout.write(b);
            }

            fin.close();
            fout.close();
        } catch (IOException e) {
            System.out.println("IO Error in file handling");
        }
    }
}