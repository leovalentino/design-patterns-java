package command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {

	public static void main(String[] args) {
		Light bedromLight = new Light();
		Light kitchenLight = new Light();
		Switch ligthSwitch = new Switch();
		Command toggleCommand = new ToggleCommand(bedromLight);
		
		
		ligthSwitch.storeAndExecute(toggleCommand);

		List<Light> lights = new ArrayList<>();
		lights.add(kitchenLight);
		lights.add(bedromLight);
		
		Command allLightsCommand = new AllLightsCommand(lights);
		
		ligthSwitch.storeAndExecute(allLightsCommand);
	}
	
}
