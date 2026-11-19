package technological.com.bean.scope.component;



public class Service {
	
	String serviceName;
	String serviceProvider;
	
	
	public void techService() {
		String service = "Service [serviceName=" + serviceName + ", serviceProvider=" + serviceProvider + "]";
		
		System.out.println(service);
	}


	public Service(String serviceName, String serviceProvider) {
		super();
		this.serviceName = serviceName;
		this.serviceProvider = serviceProvider;
	}
	
	
	

}
