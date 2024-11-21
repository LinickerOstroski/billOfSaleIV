package model;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	
	private List<StockItem> stockItem = new ArrayList<>();
	
	public Stock() {
	
	}
	
	public void addStockItem(StockItem stockItem) {
		this.stockItem.add(stockItem);
	}
	
	public void decreaseStockItem(int quantity, Product product) {
		for (StockItem stock: stockItem) {
			if(product.equals(stock.getProduct())) {
				stock.decreaseQuantity(quantity);
			}
		}
	}
	
	public boolean verifySaleItem(Product product, int quantity) {
		for (StockItem stock : stockItem) {
			if(product.equals(stock.getProduct())) {
				if(stock.getQuantityInStock() >= quantity) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return stockItem.toString();
	}
	
	
}
