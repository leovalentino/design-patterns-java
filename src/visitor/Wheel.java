package visitor;

public class Wheel implements AtvPart {

	@Override
	public void accept(AtvPartVisitor vistor) {
		vistor.visit(this);
	}
	
}
