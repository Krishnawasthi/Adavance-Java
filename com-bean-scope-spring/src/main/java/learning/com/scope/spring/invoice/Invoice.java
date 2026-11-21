package learning.com.scope.spring.invoice;

public class Invoice {
	
	String invId;
	String custName;
	double amount;
	

	public Invoice(String invId, String custName, double amount) {
		super();
		this.invId = invId;
		this.custName = custName;
		this.amount = amount;
	}



	public void invoiceDetail() {
		String data =  "Invoice [invId=" + invId + ", custName=" + custName + ", amount=" + amount + "]";
      System.out.println(data);
      
	}
	

}
