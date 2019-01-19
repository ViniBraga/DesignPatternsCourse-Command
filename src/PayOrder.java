
public class PayOrder implements Command {

	private Order order;
	
	public PayOrder(Order order) {
		this.order = order;
	}
	
	public void execute() {
		System.out.println("Paying "+order.getCustomer()+"'s order");
		order.pay();
	}

}
