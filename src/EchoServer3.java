import java.io.*;
import com.distinct.rpc.*;

public class EchoServer3 extends ECHOPROGServer{

    public static void main(String[] args) throws IOException{
        try{
			new EchoServer3();
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
		if(arg1.equals("Conor")){
			//keep things simple 
			return "101: Login Successful";
		}
		
		else if(arg1.equals("")){
			return "103: Login Failed, please try again";
		}
		
		else{
			return "102: New User Login Successful";
		}
			
	}
}//end class

