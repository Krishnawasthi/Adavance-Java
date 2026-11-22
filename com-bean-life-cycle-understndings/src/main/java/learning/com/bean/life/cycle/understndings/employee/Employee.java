package learning.com.bean.life.cycle.understndings.employee;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Employee implements InitializingBean, DisposableBean{
	
	String empName;
	String empId;
	
	public Employee(String empName, String empId) {
		super();
		System.out.println("1..Employee(String empName, String empId).................contructor called ...initialized");
		this.empName = empName;
		this.empId = empId;
	}
	
 
  @PostConstruct
  public void init() {
	 
	  System.out.println("2..inside init() when the dependency will be injected post construct to check flow.........");
	  
  }  
  public void showEmpDetails() {
		
		System.out.println("4  ..employee.showEmpDetails().............using bean.....");
		
	    }
  
  @PreDestroy
  public void cleanup() {
	  
	 System.out.println("5..doing cleanup"); 
	  
  }  

  @Override
  public void afterPropertiesSet() throws Exception {
	
	  System.out.println("3..checking the properties of fields are set properly.........");
	
  }

  @Override
  public void destroy() throws Exception {
	
	 System.out.println("6..Employee.destroy()..................");
	
  }

}
