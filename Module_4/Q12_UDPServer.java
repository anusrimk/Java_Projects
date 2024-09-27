package Module_4;

import java.net.*;

public class Q12_UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3333);


        byte[] receiveBuffer = new byte[1024];
        DatagramPacket dp1 = new DatagramPacket(receiveBuffer, receiveBuffer.length);
        

        ds.receive(dp1);
        String receivedData = new String(dp1.getData(), 0, dp1.getLength());
        System.out.println("Received number: " + receivedData);


        int num = Integer.parseInt(receivedData);
        int cube = num * num * num;
        System.out.println("Calculated cube: " + cube);
        

        byte[] sendBuffer = String.valueOf(cube).getBytes();
        InetAddress clientAddress = dp1.getAddress();
        int clientPort = dp1.getPort();
        DatagramPacket dp2 = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort);
        

        ds.send(dp2);
        ds.close();
    }
}
