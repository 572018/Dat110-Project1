package no.hvl.dat110.rpc;

import java.nio.ByteBuffer;

public class RPCUtils {
	
	public static byte[] encapsulate(byte rpcid, byte[] payload) {
		
		byte[] rpcmsg = new byte[payload.length + 1];
		
		// TODO - START
		
		// Encapsulate the rpcid and payload in a byte array according to the  RPC message syntax
		rpcmsg[0] = rpcid;
		for (int i = 0; i < payload.length; i++) {
			rpcmsg[i + 1] = payload[i];
		}
		// TODO - END
		
		return rpcmsg;
	}
	
	public static byte[] decapsulate(byte[] rpcmsg) {
		
		byte[] payload = new byte[rpcmsg.length - 1];
		
		// TODO - START
		// Decapsulate the rpcid and payload in a byte array according to the  RPC message syntax
		for(int i = 0; i < rpcmsg.length; i++) {
			payload[i] = rpcmsg[i+1]; 
		}
		// TODO - END
		
		return payload;
		
	}
	
	public static byte[] marshallString(String str) {
		
		byte[] encoded = new byte[str.getBytes().length];
		
		// TODO - START 
		encoded = str.getBytes();
		// TODO - END
		
		return encoded;
	}
	
	public static String unmarshallString(byte[] data) {
		
		String decoded = null; 
		
		// TODO - START 
		decoded = new String(data);
		// TODO - END
		
		return decoded;
	}
	
	public static byte[] marshallVoid() {
		
		byte[] encoded = new byte[1];
		// TODO - START 
		// TODO - END
		return encoded;
	}
	
	public static void unmarshallVoid(byte[] data) {
		
		// TODO
		
		//does nothing
	}
	
	public static byte[] marshallBoolean(boolean b) {
		
		byte[] encoded = new byte[1];
				
		if (b) {
			encoded[0] = 1;
		} else
		{
			encoded[0] = 0;
		}
		
		return encoded;
	}
	
	public static boolean unmarshallBoolean(byte[] data) {
		
		return (data[0] > 0);
		
	}
	
	public static byte[] marshallInteger(int x) {
		
		// TODO - START 
		byte [] encoded = ByteBuffer.allocate(4).putInt(x).array();
		// TODO - END
		
		return encoded;
	}
	
	
	public static int unmarshallInteger(byte[] data) {
		
		// TODO - START 
		int decoded = ByteBuffer.wrap(data).getInt(0);
		// TODO - END
		
		return decoded;
		
	}
}
