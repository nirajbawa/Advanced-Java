package net.exp15;

import javax.net.ssl.HttpsURLConnection;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) throws Exception{
//        url class
        URL url = new URL("https://www.google.com/");
        System.out.println("host : "+url.getHost());
        System.out.println("file : "+url.getFile());
        System.out.println("protocol : "+url.getProtocol());
        System.out.println("path : "+url.getPath());
        System.out.println("query : "+url.getQuery());
        System.out.println("port : "+url.getDefaultPort());
        System.out.println("authority : "+url.getAuthority());

//        urlConnection class
        URLConnection con = url.openConnection();
        System.out.println("ContentType : "+con.getContentType());
        System.out.println("ContentLength : "+con.getContentLength());
        System.out.println("Date : "+con.getDate());
        InputStream im = con.getInputStream();
        int i;
        while((i=im.read())!=-1)
        {
            System.out.print((char)i);
        }

        System.out.println("\n\n\n");

//        http url connection class

        HttpURLConnection hp = (HttpsURLConnection) url.openConnection();

        System.out.println("RequestMethod : "+hp.getRequestMethod());
        System.out.println("ContentLength : "+ hp.getContentLength());
        System.out.println("ResponseCode : "+hp.getResponseCode());
        System.out.println("ResponseMessage : "+hp.getResponseMessage());

        for (int j = 1; j<=8; j++)
        {
            System.out.println(hp.getHeaderFieldKey(j) + " : "+hp.getHeaderField(j));
        }
    }
}
