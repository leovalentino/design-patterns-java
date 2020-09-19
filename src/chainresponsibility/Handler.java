package chainresponsibility;

public abstract class Handler {

	protected Handler successor;
	
	public void setSucessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(Request request);
	
}
