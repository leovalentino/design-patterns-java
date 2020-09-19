package mediator;

public class MediatorDemo {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		Light bedroomLight = new Light("Bedroom");
		Light kicthenLight = new Light("Kitchen");
		
		mediator.registerLight(bedroomLight);
		mediator.registerLight(kicthenLight);
		
		Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
		
		turnOnAllLightsCommand.execute();
		
		Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
		
		turnOffAllLightsCommand.execute();
	}
	
}
