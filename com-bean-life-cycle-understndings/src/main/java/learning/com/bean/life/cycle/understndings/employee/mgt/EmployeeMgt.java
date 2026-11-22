package learning.com.bean.life.cycle.understndings.employee.mgt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import learning.com.bean.life.cycle.understndings.employee.Employee;

@Component
@Scope("prototype")
public class EmployeeMgt {
  
	@Autowired 
	
	Employee employee;  //scope prototype
	
	
  public void empMgtdetails() { 
	System.out.println("EmployeeMgt.empMgtdetails().............bean called....");
	employee.showEmpDetails();
  }
	
}
