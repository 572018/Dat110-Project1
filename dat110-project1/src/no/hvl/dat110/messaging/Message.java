package no.hvl.dat110.messaging;

import no.hvl.dat110.TODO;

public class Message {

	private byte[] data;

	public Message(byte[] data) {

		if (data.length <= 127) {
			this.data = data;
		} else {
			throw new UnsupportedOperationException("data is null or more than 128 bytes");
		}
	}

	public byte[] getData() {
		return this.data;
	}

}
