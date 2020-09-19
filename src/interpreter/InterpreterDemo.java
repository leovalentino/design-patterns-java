package interpreter;

public class InterpreterDemo {

	static Expression buildInterpreterTree() {
		Expression terminal1 = new TerminalExpression("Lions");
		Expression terminal2 = new TerminalExpression("Tiger");
		Expression terminal3 = new TerminalExpression("Bears");
		
		Expression alterantion1 = new AndExpression(terminal2, terminal3);
		
		Expression alterantion2 = new OrExpression(terminal1, alterantion1);
		
		return new AndExpression(terminal3, alterantion2);
	}
	
	public static void main(String[] args) {
		//String context = "Lions";
		//String context = "Tigers";
		//String context = "Lions Tigers";
		//String context = "Lions Bears";
		String context = "Tiger Bears";
		
		Expression define = buildInterpreterTree();
		
		System.out.println(context + " is " + define.interpret(context));
	}

}
