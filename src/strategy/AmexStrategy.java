package strategy;

public class AmexStrategy extends ValidationStrategy {

	@Override
	public boolean isValid(CreditCard creditCard) {
		boolean isVAlid = true;
		
		isVAlid = creditCard.getNumber().startsWith("37") || creditCard.getNumber().startsWith("34");
		
		if(isVAlid) {
			isVAlid = creditCard.getNumber().length() == 15;
		}
		
		if (isVAlid) {
			isVAlid = passesLuhn(creditCard.getNumber());
		}
		
		return isVAlid;
	}

}
