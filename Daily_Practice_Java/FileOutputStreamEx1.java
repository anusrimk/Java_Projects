package Daily_Practice_Java;

import java.io.*;

public class FileOutputStreamEx1 {
    public static void main(String[] args) {

     // for appending into the same file, we have to add true in the file path )
        // try(FileOutputStream f=new FileOutputStream("checkFileInput/new.txt")){
            try(FileOutputStream f=new FileOutputStream("checkFileInput/new.txt", true)){
            String s="Welcome new string";
            byte b[]=s.getBytes();
            f.write(b);
            System.out.println("written in java");
        }
        catch (FileNotFoundException e) {
            System.out.println("IO Error");
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}