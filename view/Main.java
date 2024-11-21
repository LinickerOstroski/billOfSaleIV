package view;

import model.Product;
import model.SaleManager;
import model.Stock;
import model.StockItem;

public class Main {
	public static void main(String[] args) {
		
		Product rice = new Product();
		rice.setDescription("Arroz Tatiana");
		rice.setPrice(30);
		
		Product beans = new Product();
		beans.setDescription("Feijão Feijó");
		beans.setPrice(20);
		
		Product pasta = new Product();
		pasta.setDescription("Macarrão Santa Amália");
		pasta.setPrice(15);
		
		StockItem stockRice = new StockItem(rice,20);
		StockItem stockBeans = new StockItem(beans,20);
		StockItem stockPasta = new StockItem(pasta,20);
		
		Stock stock1 = new Stock();
		
		stock1.addStockItem(stockRice);
		stock1.addStockItem(stockBeans);
		stock1.addStockItem(stockPasta);
		
		SaleManager saleManager = new SaleManager(stock1);
		
		if(saleManager.createSaleItem(pasta, 10)) {
			System.out.println("SaleItem adicionado à venda com sucesso!");
			System.out.println(saleManager.getSale().getItems());
			
			System.out.println("Dados do Estoque:");
			System.out.println(stock1.toString());
			
			}else {
			System.out.println("Quantidade insuficiente no estoque");
		}
		
		
		/*
		Product rice = new Product();
		rice.setDescription("Arroz Tatiana");
		rice.setPrice(30);
		
		Product beans = new Product();
		beans.setDescription("Fijão Feijó");
		beans.setPrice(20);
		
		Product pasta = new Product();
		pasta.setDescription("Macarrão Santa Amália");
		pasta.setPrice(15);
		
		SaleItem itemRice = new SaleItem();
		itemRice.setProduct(rice);
		itemRice.setQuantity(2);
		
		SaleItem itemBeans = new SaleItem();
		itemBeans.setProduct(beans);
		itemBeans.setQuantity(1);
		
		SaleItem itemPasta = new SaleItem();
		itemPasta.setProduct(pasta);
		itemPasta.setQuantity(6);
		
		Sale sale = new Sale();
		sale.addSaleItem(itemRice);
		sale.addSaleItem(itemBeans);
		sale.addSaleItem(itemPasta);
		
		for (SaleItem item : sale.getItems())
			System.out.println(item);
		
		System.out.println(String.format("Total: %.2f", 
				sale.getTotal()));
		 */
	}
}
