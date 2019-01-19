
import java.util.Calendar;

public class Order {

	private String customer;
	private double value;
	private Status status;
	private Calendar deliveryDate;
	
	public Order(String customer, double value) {
		super();
		this.customer = customer;
		this.value = value;
		this.status = Status.NEW;
	}
	
	public String getCustomer() {
		return customer;
	}

	public void pay() {
		status = Status.PAYED;
	}
	
	public void finalize() {
		deliveryDate = Calendar.getInstance();
		status = Status.DELIVERED;
	}
	
}
