package finance.spring.bean.life.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import finance.spring.bean.life.cycle.account.mgt.AccountMgt;
import finance.spring.bean.life.cycle.config.AccountConfig;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext iocContainer = new AnnotationConfigApplicationContext(AccountConfig.class);
		AccountMgt accMgt = iocContainer.getBean(AccountMgt.class);
		accMgt.showInfo();
	}			
	
}