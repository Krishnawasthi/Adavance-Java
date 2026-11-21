package technology.com.amazon.product.scope.bean.prod.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import technology.com.amazon.product.scope.bean.product.Product;

@Configuration
@ComponentScan(basePackages = "technology.com.amazon.product.scope.bean")
public class ProdConfig {
	
	@Bean("prod1")
    @Scope("singleton")
	public Product infoProduct1() {
		
		return new Product("iPhone19", "239424114212424A", 175000, 3);
		
	}
	
	@Bean("prod2")
    @Scope("singleton")
	@Primary
	public Product infoProduct2() {
		
		return new Product("samsungGalaxy s26", "673524114212424B", 198000, 4);
		
	}

}
