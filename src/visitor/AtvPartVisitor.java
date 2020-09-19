package visitor;

public interface AtvPartVisitor {

	void visit(Wheel wheel);
	void visit(Oil oil);
	void visit(Fender fender);
	void visit(PartsOrder partsOrder);

}
