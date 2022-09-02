package com.java.search.NetworkingInJava;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        System.out.println("This is the example of the server");
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();
            System.out.println("Message "+ str);
            ss.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
