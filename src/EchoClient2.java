
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.*;
import javax.swing.*;

/**
 * This module contains the presentaton logic of an Echo Client.
 * @author M. L. Liu
 */
public class EchoClient2{

   public static void main(String[] args){
	   ECHOPROG client;
	   String username;
	   String password;
	   
	   try{
		   client = new ECHOPROG(InetAddress.getByName("localhost"), true);
		   
		   username = JOptionPane.showInputDialog(null, "Enter username");
		   password = JOptionPane.showInputDialog(null, "Enter password");
		   
		   if(username.equals("")){
			   username = ".";
		   }
		   
		   if(password.equals("")){
			   password = ".";
		   }
		   
		   String message = client.login_1(username, password);
		   
		   JOptionPane.showMessageDialog(null, message);
	   }
	   
	   catch(Exception e){
		   e.printStackTrace();
	   }
   }

}//end class
