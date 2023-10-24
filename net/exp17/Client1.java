//package net.exp17;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws IOException {
        while(true) {
            DatagramSocket ds = new DatagramSocket(3000);
            String str = "";
            System.out.println("Enter number : ");
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 5000);
            ds.send(dp);

            byte buf[] = new byte[1024];
            DatagramPacket dp2 = new DatagramPacket(buf, 1024);
            ds.receive(dp2);
            str = new String(buf, 0, dp.getLength());
            System.out.println("number is : "+str);
            ds.close();
        }
    }
}
