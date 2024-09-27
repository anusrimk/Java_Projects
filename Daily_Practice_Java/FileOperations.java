//create a file File123.txt on desktop, check the properties of this file through your program. Create another file
// File456 on desktop using create new method (createnew file). Make a directory using mkdir Dir1, then 
//Dir2/SubDir1. Rename File 456 .txt to File654.txt
//create 2 files in SubDir1 as File11.txt and File22.txt and then list all files and subdirectories in Dir2
package Daily_Practice_Java;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        try{

            File f1 = new File("/Users/anusrikarmokar/Desktop/File123.txt");
            f1.createNewFile();
            System.out.println("File Name: " + f1.getName());
            System.out.println("Path: " + f1.getPath());
            System.out.println("Abs Path: " + f1.getAbsolutePath());
            System.out.println("Parent: " + f1.getParent());
            System.out.println(f1.exists() ? "exists" : "does not exist");
            System.out.println(f1.isDirectory() ? "is directory" : "is not a directory");
            System.out.println(f1.isFile() ? "is file" : "is not a file");
            System.out.println(f1.isAbsolute() ? "is absolute" : "is not absolute");
            System.out.println("File last modified: " + f1.lastModified());
            System.out.println("File size: " + f1.length() + " Bytes");
            
            
            File f2 = new File("/Users/anusrikarmokar/Desktop/File456.txt");
            f2.createNewFile();
            
            File dir1 = new File("/Users/anusrikarmokar/Desktop/Dir1");
            dir1.mkdir();
            
            File dir2 = new File("/Users/anusrikarmokar/Desktop/Dir2/SubDir1");
            dir2.mkdirs();
            
            File f3 = new File("/Users/anusrikarmokar/Desktop/File456.txt");
            File f4 = new File("/Users/anusrikarmokar/Desktop/File654.txt");
            f3.renameTo(f4);
            
            File f5 = new File("/Users/anusrikarmokar/Desktop/Dir2/File11.txt");
            f5.createNewFile();
            File f6 = new File("/Users/anusrikarmokar/Desktop/Dir2/File22.txt");
            f6.createNewFile();
            
            File dir2Files = new File("/Users/anusrikarmokar/Desktop/Dir2");
            for (File file : dir2Files.listFiles()) {
                System.out.println(file.getName());
            }
            System.out.println("File size: " + f1.length() + " Bytes");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
