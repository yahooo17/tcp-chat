package by.bsuir.mag;

import java.io.*;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/*
 * This class defines the different type of messages that will be exchanged between the
 * Clients and the Server. 
 * When talking from a Java Client to a Java Server a lot easier to pass Java objects, no 
 * need to count bytes or to wait for a line feed at the end of the frame
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ChatMessage implements Serializable {

	// The different types of message sent by the Client
	// WHOISIN to receive the list of the users connected
	// MESSAGE an ordinary text message
	// LOGOUT to disconnect from the Server
	static final int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2;
	private int type;
	private String username;
	private String message;
	
	// constructor

	public ChatMessage() {
	}

	public ChatMessage(int type, String message) {
		this.type = type;
		this.message = message;
	}

	public ChatMessage(int type, String username, String message) {
		this.type = type;
		this.username = username;
		this.message = message;
	}

	int getType() {
		return type;
	}

	String getMessage() {
		return message;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
