package templatemethod;

public class TemplateMethod {

	public static void main(String[] args) {
		System.out.println("Web Order:");
		
		OrderTemplate webOrder = new WebOrder();
		webOrder.processOrder();
		
		System.out.println("\nWeb Order:");
		
		OrderTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder();
	}
	
}
