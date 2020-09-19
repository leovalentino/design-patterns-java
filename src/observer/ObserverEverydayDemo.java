package observer;

public class ObserverEverydayDemo {

	public static void main(String[] args) {
		Subject subject = new MessageStream();
		
		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tableClient = new TabletClient(subject);
		
		
		phoneClient.addMessage("Here is a new message!");
		tableClient.addMessage("Another new message!");		
	}
	
}
