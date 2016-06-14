// Date Server

import java.net.*;
import java.io.*;
import java.util.*;

class server
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket s=new ServerSocket(5217);
        // DataOutputStream out=new DataOutputStream(soc.getOutputStream());

        while(true)
        {
            System.out.println("Waiting For Connection ...");
            Socket soc=s.accept();
            DataOutputStream out=new DataOutputStream(soc.getOutputStream());
            out.writeBytes("Server Date" + (new Date()).toString() + "\n");
            out.close();
            soc.close();
        }
        // System.out.println("client got served with todays date.");
        // out.writeBytes("client got served with todays date.");

    }
}
