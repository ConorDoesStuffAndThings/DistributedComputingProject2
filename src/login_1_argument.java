import com.distinct.rpc.*;
import java.util.Vector;
import java.util.Hashtable;

/**
 * This class was automatically generated by Jrpcgen from the RPC/XDR file "stdin".<br>
 * login_1_argument: was struct
 */

public class login_1_argument implements XDRType{
  public String arg1;
  public String arg2;

    /**
     * Default constructor for objects of class login_1_argument.
     */

    public login_1_argument(){

    }

    /**
     * Creates an object of class login_1_argument.
     * @param     arg_arg1 The value of the arg1 component.
     * @param     arg_arg2 The value of the arg2 component.
     */

    public login_1_argument(String arg_arg1, String arg_arg2) {
      arg1 = arg_arg1;
      arg2 = arg_arg2;
    }

    /**
     * Encodes an object of class login_1_argument in compliance with RFC 1832 (XDR).
     * @param     xdrs The XDR output stream.
     */

    public void xdr_encode(XDRStream xdrs){
      xdrs.xdr_encode_string(arg1);
      xdrs.xdr_encode_string(arg2);
    }

    /**
     * Decodes an object of class login_1_argument in compliance with RFC 1832 (XDR).
     * @param     xdrs The XDR input stream.
     * @exception RPCError Thrown if the call fails for any reason.
     */

    public void xdr_decode(XDRStream xdrs) throws RPCError{
      arg1 = xdrs.xdr_decode_string();
      arg2 = xdrs.xdr_decode_string();
    }
}
