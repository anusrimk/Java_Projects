package Module_4;

import java.net.*;
import java.util.Scanner;

public class Q12_UDPClient {
    public static void main(String[] args) throws Exception {

        DatagramSocket ds = new DatagramSocket();


        InetAddress ia = InetAddress.getByName("localhost");


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String numStr = String.valueOf(num);
        byte[] sendBuffer = numStr.getBytes();


        DatagramPacket dp1 = new DatagramPacket(sendBuffer, sendBuffer.length, ia, 3333);
        ds.send(dp1);


        byte[] receiveBuffer = new byte[1024];
        DatagramPacket dp2 = new DatagramPacket(receiveBuffer, receiveBuffer.length);
        

        ds.receive(dp2);
        String result = new String(dp2.getData(), 0, dp2.getLength());
        

        System.out.println("Cube of the number: " + result);


        ds.close();
        sc.close();
    }
}
