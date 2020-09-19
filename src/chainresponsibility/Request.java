package chainresponsibility;

public class Request {

	private RequestType requesType;
	private double amount;
	
	public Request(RequestType requesType, double amount) {
		super();
		this.requesType = requesType;
		this.amount = amount;
	}

	public RequestType getRequesType() {
		return requesType;
	}

	public double getAmount() {
		return amount;
	}
	
	
}
