package oopIntro;

public class Main {

	public static void main(String[] args) {
	
		Product product1 = new Product(); // referans oluştuma intance 
		product1.id= 1;
		product1.detail="RTX";
		product1.name="monster";
		product1.unitPrice=17000;
		
		Product product2 = new Product(); // referans oluştuma intance 
		product2.id= 2;
		product2.detail="RTX 3070";
		product2.name="msi";
		product2.unitPrice=19000;
		
		Product product3 = new Product(); // referans oluştuma intance 
		product3.id= 3;
		product3.detail="GTX";
		product3.name="Excalibur";
		product3.unitPrice=7000;
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products ) {
			System.out.println(product.name);
			
		}
		
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="Laptop";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Gaming Laptop";
		ProductManager productManager =new ProductManager();
		productManager.addToCart(product1);
		
	}

}
