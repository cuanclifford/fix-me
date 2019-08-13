package za.co.wethinkcode.fix_me;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    		System.out.println("Attempting connection on port " + args[0]);
    		Socket clientSocket = new Socket("localhost", Integer.parseInt(args[0]));
    		clientSocket.close();
    	} catch (IOException e) {
    		System.out.println(e);
    	}
    }
}