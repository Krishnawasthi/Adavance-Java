package technology.com.amazon.product.scope.bean.product;

public class Product {
	
	String prodName;
	String prodId;
    int prodPrice;
    int quantity;
    
	public Product(String prodName, String prodId, int prodPrice, int quantity) {
		super();
		this.prodName = prodName;
		this.prodId = prodId;
		this.prodPrice = prodPrice;
		this.quantity = quantity;
	}
	
	public void showProdDetails() {
		
		String prodData = "Product [Product Name= "+prodName +", Product ID= "+ prodId + ", Product price= "+prodPrice +", Quantity= "+ quantity +"]";
		System.out.println(prodData);
	}

	

}
