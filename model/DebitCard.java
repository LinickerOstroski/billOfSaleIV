package model;

public class DebitCard implements Payment {

	@Override
	public double paymentMethod(double total) {
		return total;
	}

}