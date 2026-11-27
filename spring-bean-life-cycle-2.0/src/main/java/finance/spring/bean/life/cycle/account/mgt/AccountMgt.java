package finance.spring.bean.life.cycle.account.mgt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import finance.spring.bean.life.cycle.account.Account;

@Component
public class AccountMgt {
	  
	@Autowired
	 Account account;
	
  public void showInfo() {
	  
	  System.out.println("AccountMgt.showInfo().....Start");
	  account.openAccount();
  }
}
