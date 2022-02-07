package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static final int MESSAGINGPORT = 8080;
	public static final String MESSAGINGHOST = "localhost";

	public static byte[] encapsulate(Message message) {

		byte[] segment = null;

		// TODO - START
		segment = new byte[SEGMENTSIZE];

		segment[0] = (byte) message.getData().length;
		for (int i = 0; i < message.getData().length; i++) {
			segment[i + 1] = message.getData()[i];
		}
		// encapulate/encode the payload data of the message and form a segment
		// according to the segment format for the messagin layer

		// TODO - END
		return segment;
	}

	public static Message decapsulate(byte[] segment) {

		Message message = null;

		// TODO - START
		// decapsulate segment and put received data into a message

		int length = segment[0]; 
		byte[] payload = new byte[length];
		
		for(int i = 0; i < length; i++) {
			payload[i] = segment[i+1]; 
		}
		message = new Message(payload);
		// TODO - END

		return message;

	}

}
