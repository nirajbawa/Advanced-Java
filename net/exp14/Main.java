package net.exp14;

import java.net.*;

public class Main{
    public static void main(String[] args) throws Exception  {
        InetAddress la= InetAddress.getByName("www.javatpoint.com");
        System.out.println(la);
        System.out.println(la.getHostName());
        System.out.println(la.getHostAddress());
        System.out.println(la.getLocalHost());
        byte addr[]={72, 3, 2, 12};
        InetAddress ip2 =  InetAddress.getByAddress(addr);
        System.out.println(ip2);
        System.out.print("\nisMulticastAddress : " +la.isMulticastAddress());
        System.out.print("\nisSiteLocalAddress : " +la.isSiteLocalAddress());
        System.out.print("\nisLoopbackAddress : " +la.isLoopbackAddress());
    }
}
