//package net.exp16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.stream.IntStream;

public class ChatClient {
    public static void main(String[] args) {
        String str = "";
        BufferedReader inputFromServer;
        BufferedReader inputFromUser;
        PrintWriter outPut_to_Server;


        try {
            inputFromUser = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("start chat...");
            System.out.println("type bye to exit");
            Socket s = new Socket("", 5000);

            inputFromServer = new BufferedReader(new InputStreamReader(s.getInputStream()));
            outPut_to_Server = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));

            while(true)
            {
                System.out.println("Enter Message : ");
                str = inputFromUser.readLine();
                outPut_to_Server.println(str);
                outPut_to_Server.flush();

                if(str.equalsIgnoreCase("bye"))
                {
                    break;
                }


                str = inputFromServer.readLine();
                System.out.println("received : "+str);

                if(str.equalsIgnoreCase("bye"))
                {
                    break;
                }


            }

            ;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
