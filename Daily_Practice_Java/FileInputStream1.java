package Daily_Practice_Java;


import java.io.*;

public class FileInputStream1 {
    public static void main(String[] args) {

        FileInputStream fin = null;
        try {

            fin = new FileInputStream("checkFileInput/new.txt");

            int b;

            while ((b = fin.read()) != -1) {

                System.out.println((char) b);

            }
        } catch (FileNotFoundException e) {

            System.out.println("File not found exception");

        } catch (IOException e) {

            System.out.println("IO Error");

        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}