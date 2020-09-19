package mediator;

//receiver
public class Light {

	private boolean isOn = false;
	
	private String msg = "";
	
	public Light(String msg) {
		this.msg = msg;
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	public void toggle() {
		if (isOn) {
			off();
			isOn = false;
		} else {
			on();
			isOn = true;
		}
	}
	
	public void on() {
		System.out.println("Light switched on.");
	}
	
	public void off() {
		System.out.println("Light switched off.");
	}
	
}
