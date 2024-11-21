package model;

public class SaleManager {

	private Sale sale = new Sale();
	private Stock stock;
	
	public SaleManager(Stock stock) {
		this.stock = stock;
	}
	
	public Sale getSale() {
		return sale;
	}
	
	public Stock getStock() {
		return stock;
	}
	
	public boolean createSaleItem(Product product, int quantity) {
		if(stock.verifySaleItem(product,quantity)) {
			sale.addSaleItem(new SaleItem(product,quantity));
			stock.decreaseStockItem(quantity, product);
			return true;
		}else {
			return false;
		}
	}
}
