package Module_4;

import java.io.*;
import java.net.*;

public class Q11_TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server is waiting for a client...");


            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");


            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);


            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage, serverResponse;

            while (true) {

                clientMessage = in.readLine();
                System.out.println("Client: " + clientMessage);

                if (clientMessage.equalsIgnoreCase("bye")) {
                    break;
                }


                System.out.print("Server: ");
                serverResponse = userInput.readLine();
                out.println(serverResponse);
            }


            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
