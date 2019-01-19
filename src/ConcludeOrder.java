

public class ConcludeOrder implements Command {

	private Order order;
	
	public ConcludeOrder(Order order) {
		this.order = order;
	}
	
	public void execute() {
		System.out.println("Concluding "+order.getCustomer()+"'s order");
		order.finalize();
	}

}
