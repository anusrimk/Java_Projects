package Daily_Practice_Java;

import java.io.File;
import java.io.IOException;

class FileDemo {
    public static void main(String args[]) throws IOException {
        File f1 = new File("/Users/anusrikarmokar/Desktop/Java/Daily_Practice_Java");
        
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

        if (f1.isDirectory()) {
            for (File subfile : f1.listFiles()) {
                System.out.println("\t" + subfile);
            }
        }

        File obj = new File("/Users/anusrikarmokar/Desktop/Java/Daily_Practice_Java/hello.txt");
        obj.createNewFile(); // throws IOException // return boolean
        // obj.delete();

        File obj1 = new File("/Users/anusrikarmokar/Desktop/Java/Daily_Practice_Java/hello.txt");
        System.out.println(obj1.mkdir()); // return boolean

        File obj2 = new File("/Users/anusrikarmokar/Desktop/Java/Daily_Practice_Java/hello.txt");
        System.out.println(obj2.mkdirs()); // return boolean

        File obj3 = new File("/Users/anusrikarmokar/Desktop/Java/Daily_Practice_Java/hello.txt");
        System.out.println(obj.renameTo(obj3));

        File obj4 = new File("/Users/anusrikarmokar/Desktop/Java/Daily_Practice_Java/hello.txt");
        System.out.println(obj.renameTo(obj4));
    }
}
