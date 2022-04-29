
import javax.net.ssl.SSLServerSocketFactory;
import java.io.*;
import java.lang.reflect.Array;
import java.net.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import com.distinct.rpc.*;

/**
 * This module contains the application logic of an echo server
 * which uses a stream-mode socket for interprocess communication.
 * Unlike EchoServer2, this server services clients concurrently.
 * A command-line argument is required to specify the server port.
 * @author M. L. Liu
 */

public class EchoServer3 extends ECHOPROGServer{

    public static void main(String[] args) throws IOException{
        try{
			new EchoServer3();//creates an instance of the server stub
			System.out.print("Server running...");
		}
		
		catch(RPCError e){
			System.out.print(e.getMessage());
		}
		
    }//end main
	
	public EchoServer3() throws RPCError {
		super();
	}
	
	public String login_1(String arg1, String arg2){
		if(arg1.equals("Jaster")){
			//keep things simple 
			return "101 Logged in. Welcome Back";
		}
		
		else if(arg1.equals(".")){
			return "103 Error Occured";
		}
		
		else{
			return "102 Logged in. Welcome new User";
		}
			
	}
} // end class

