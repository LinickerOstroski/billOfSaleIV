package model;

public class Pix implements Payment {

	@Override
	public double paymentMethod(double total) {
		double discount = total * (5.0/100.0); //desconto
		return total - discount;
	}
	
}