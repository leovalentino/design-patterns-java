package visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {

	private List<AtvPart> parts = new ArrayList<>();
	
	public void addPart(AtvPart atvPart) {
		parts.add(atvPart);
	}
	
	public List<AtvPart> getParts() {
		return Collections.unmodifiableList(parts);
	}
	
	@Override
	public void accept(AtvPartVisitor vistor) {
		for (AtvPart atvPart : parts) {
			atvPart.accept(vistor);
		}
		vistor.visit(this);
	}

}
