package finance.spring.bean.life.cycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import finance.spring.bean.life.cycle.account.Account;

@Configuration 
@ComponentScan(basePackages = "finance.spring.bean.life.cycle")
public class AccountConfig {
	
	@Bean
	public Account accountDetails() {
		
		return new Account("23100001300907","krishna mohan awasthi", 1500000000);
		
	}

}
