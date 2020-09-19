package visitor;

public class Fender implements AtvPart {

	@Override
	public void accept(AtvPartVisitor vistor) {
		vistor.visit(this);
	}

}
