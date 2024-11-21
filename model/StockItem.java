package model;

public class StockItem {
	
	private Product product;
	private int quantityInStock;
	
	public StockItem(Product product, int quantityInStock) {
		this.product = product;
		this.quantityInStock = quantityInStock;
	}
	public Product getProduct() {
		return product;
	}
	
	public int getQuantityInStock() {
		return quantityInStock;
	}
	
	public void decreaseQuantity(int quantity) {
		this.quantityInStock -= quantity;
	}
	
	public void addQuantity(int quantity) {
		this.quantityInStock += quantity;
	}
	@Override
	public String toString() {
		return "Product:" + product.getDescription() + ", quantityInStock: " + quantityInStock;
	}
	
	
}
