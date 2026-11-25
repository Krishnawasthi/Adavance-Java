package Ecom.com.ecom.order.application;

import Ecom.com.ecom.order.Emailservice;
import Ecom.com.ecom.order.Notification;
import Ecom.com.ecom.order.OrderService;
import Ecom.com.ecom.order.SmsNotification;

public class App 
{
    public static void main( String[] args )
    {
    	Notification not = new Emailservice();
    	
    	OrderService order = new OrderService(not);
    	
    	order.orderSerivce();
    	
       
    }
}
