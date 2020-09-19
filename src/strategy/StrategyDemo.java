package strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		CreditCard amexCard = new CreditCard(new AmexStrategy());
		
		amexCard.setNumber("377998090653734");
		amexCard.setDate("04/2020");
		amexCard.setCvv("123");
		
		System.out.println("Is Amex valid: " + amexCard.isValid());
		
		CreditCard visaCard = new CreditCard(new VisaStrategy());
		
		visaCard.setNumber("4556642235560983");
		visaCard.setDate("06/11/2021");
		visaCard.setCvv("123");
		
		System.out.println("Is Visa valid: " + visaCard.isValid());
	}

}
