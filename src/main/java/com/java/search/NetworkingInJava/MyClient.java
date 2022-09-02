package com.java.search.NetworkingInJava;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
    public static void main(String[] args) {
        System.out.println("This is the example of the Networking ");
        try {
            Socket sc = new Socket("localhost",6666);
            DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            sc.close();
            
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
