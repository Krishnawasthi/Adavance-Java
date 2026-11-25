package Ecom.com.ecom.order;

public class OrderService  {
	
	
     Notification notification;

    
	public OrderService(Notification notification) {
		super();
		this.notification = notification;
	}


	public void orderSerivce() {
		
		System.out.println("your order is out for delivery!!!!!!");
		
		notification.orderNotification();
		
	}

	

}
