package learning.com.scope.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learning.com.scope.spring.invoice.Invoice;
import learning.com.scope.spring.invoice.config.invConfig;

public class App {
	
  public static void main(String[] args) {
	  
	ApplicationContext context = new AnnotationConfigApplicationContext(invConfig.class);
	
	Invoice inv1 = (Invoice) context.getBean("inv");
	
	inv1.invoiceDetail();
	
	Invoice inv2 = (Invoice) context.getBean("inv");
	
	inv1.invoiceDetail();
	
	System.out.println(inv1 == inv2);
}

}
