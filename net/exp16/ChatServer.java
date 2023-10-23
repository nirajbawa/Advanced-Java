//package net.exp16;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {
        BufferedReader w1, w2;
        PrintWriter p1, p2;
        String str = "";
        try{
            System.out.println("starting server...");
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("started");
            Socket s1 = ss.accept();
            Socket s2 = ss.accept();

            p1 = new PrintWriter(new OutputStreamWriter(s1.getOutputStream()));
            p2 = new PrintWriter(new OutputStreamWriter(s2.getOutputStream()));
            w1 = new BufferedReader(new InputStreamReader(s1.getInputStream()));
            w2 = new BufferedReader(new InputStreamReader(s2.getInputStream()));

            while(true)
            {
                str = w1.readLine(); p2.println(str); p2.flush();
                str = w2.readLine(); p1.println(str); p1.flush();
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
