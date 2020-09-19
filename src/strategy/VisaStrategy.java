package strategy;

public class VisaStrategy extends ValidationStrategy {

	@Override
	public boolean isValid(CreditCard creditCard) {
		boolean isVAlid = true;
		
		isVAlid = creditCard.getNumber().startsWith("4");
		
		if(isVAlid) {
			isVAlid = creditCard.getNumber().length() == 16;
		}
		
		if (isVAlid) {
			isVAlid = passesLuhn(creditCard.getNumber());
		}
		
		return isVAlid;
	}

}
