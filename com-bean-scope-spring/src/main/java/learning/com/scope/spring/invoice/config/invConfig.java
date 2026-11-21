package learning.com.scope.spring.invoice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import learning.com.scope.spring.invoice.Invoice;

@Configuration
public class invConfig {
	
	
	@Bean("inv")
    @Scope("prototype")
	public Invoice showInvoice() {
		
		return new Invoice("23422!242kto","Krishna", 23000.00);
	}
			
			
	

}
