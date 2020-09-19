package command2;

import java.util.HashMap;
import java.util.Map;

//invoker
public class Switch {

	private final Map<String, Command> commandMap = new HashMap<>();
	
	public void register(String commandName, Command command) {
		commandMap.put(commandName, command);
	}
	
	public void execute(String commandName) {
		Command command = commandMap.get(commandName);
		if (command == null) {
			throw new IllegalStateException("no command registered for " + commandName);
		}
		command.execute();
	}
	
}
