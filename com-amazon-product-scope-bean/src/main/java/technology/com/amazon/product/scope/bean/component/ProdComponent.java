package technology.com.amazon.product.scope.bean.component;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import technology.com.amazon.product.scope.bean.product.Product;

@Component
public class ProdComponent {
	
	@Autowired
	@Qualifier("prod2")
	 ObjectProvider<Product> productProvider;
	
	public void prodComponentDetails() {
		
		Product product1 = productProvider.getObject();
		Product product2 = productProvider.getObject();
		product1.showProdDetails();
		product2.showProdDetails();
	
		
		
	}

}
