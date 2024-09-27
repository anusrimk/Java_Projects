import java.io.*;

public class Q10_MarkResetDemo {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.txt"))) {
            if (bis.markSupported()) {
                System.out.println("Mark supported");
                bis.mark(100);  // Mark the current position

                // Read and print characters
                System.out.print((char) bis.read());
                System.out.print((char) bis.read());

                bis.reset();  // Reset back to the mark
                System.out.print((char) bis.read());  // Read again from the marked position

                bis.skip(2);  // Skip 2 characters
                System.out.print((char) bis.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
