//package net.exp17;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client2 {
    public static void main(String[] args) throws IOException {
        while(true) {
            DatagramSocket ds = new DatagramSocket(5000);
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, 1024);
            ds.receive(dp);
            String str = new String(dp.getData(), 0, dp.getLength());
            String flag = "";
            if(Integer.parseInt(str)%2==0)
            {
                flag = "even";
            }
            else{
                flag = "odd";
            }
            System.out.println("number is " + flag);

            DatagramPacket dp2 = new DatagramPacket(flag.getBytes(), flag.length(), InetAddress.getByName("127.0.0.1"), 3000);
            ds.send(dp2);
            ds.close();
        }
    }
}
