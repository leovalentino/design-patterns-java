package chainresponsibility;

public class VP extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getRequesType() == RequestType.PURCHASE) {
			if (request.getAmount() < 1500) {
				System.out.println("VPS can approve purchases below 1500");
			} else {
				successor.handleRequest(request);
			}
		}
	}

}
