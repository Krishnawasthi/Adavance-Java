package technology.com.amazon.product.scope.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import technology.com.amazon.product.scope.bean.component.ProdComponent;
import technology.com.amazon.product.scope.bean.prod.config.ProdConfig;
import technology.com.amazon.product.scope.bean.product.Product;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext iocContainer = new AnnotationConfigApplicationContext(ProdConfig.class);
       
       ProdComponent pdtCom = iocContainer.getBean(ProdComponent.class);
       
       pdtCom.prodComponentDetails();
       
       
    }
}
