package strategy;

public abstract class ValidationStrategy {

	public abstract boolean isValid(CreditCard creditCard);
	
	public boolean passesLuhn(String ccNumber) {
		int sum = 0;
		boolean alterante = false;
		for (int i = ccNumber.length() - 1; i >= 0; i--) {
			int n = Integer.parseInt(ccNumber.substring(i, i + 1));
			if (alterante) {
				n *= 2;
				if (n > 9) {
					n = (n % 10) + 1;
				}
			}
			sum += n;
			alterante = !alterante;
		}
		return (sum % 10 == 0);
	}
	
}
