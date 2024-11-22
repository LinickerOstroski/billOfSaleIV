package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	private List<SaleItem> items = new ArrayList<>();
	
	public void addSaleItem(SaleItem item) {
		items.add(item);
	}
	
	public double getTotal(Payment payment) {
		double total = 0;
		
		for (SaleItem saleItem : items) {
			total += saleItem.getSubtotal();
		}
		
		return payment.paymentMethod(total);
	}
	
	public List<SaleItem> getItems() {
		return new ArrayList<>(items);
	}

	@Override
	public String toString() {
		return items.toString();
	}
	
	
}
