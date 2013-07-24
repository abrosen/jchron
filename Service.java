import java.math.BigInteger;

public abstract class Service {
	String id;
	MessageRouter router;

	public Service(MessageRouter router) { 
		
	}
	
	public boolean  handleMessage(Message message) {
		return message.service.equals(this.id);
	}
	
	
	public boolean stop() {
		return false;
	}
	
	public abstract String[] attachToConsole();
	
	public abstract boolean changeInResponsiblity();
	
	public boolean sendMessage(Message message, BigInteger destination) {

		return false;
	}
}
