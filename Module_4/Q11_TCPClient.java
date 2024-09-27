package Module_4;

import java.io.*;
import java.net.*;

public class Q11_TCPClient {
    public static void main(String[] args) {
        try {

            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server!");


            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);


            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage, serverMessage;

            while (true) {

                System.out.print("Client: ");
                clientMessage = userInput.readLine();
                out.println(clientMessage);

                if (clientMessage.equalsIgnoreCase("bye")) {
                    break;
                }


                serverMessage = in.readLine();
                System.out.println("Server: " + serverMessage);
            }


            socket.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
