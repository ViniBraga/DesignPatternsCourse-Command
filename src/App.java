
public class App {

	public static void main(String[] args) {
		Order o1 = new Order("John", 150.0);
		Order o2 = new Order("Paul", 250.0);
		Order o3 = new Order("George", 100.0);
		Order o4 = new Order("Ringo", 400.0);
		
		WorkQueue queue = new WorkQueue();
		queue.add(new PayOrder(o1));
		queue.add(new PayOrder(o2));
		queue.add(new PayOrder(o3));
		queue.add(new PayOrder(o4));
		queue.add(new ConcludeOrder(o1));
		queue.add(new ConcludeOrder(o2));
		queue.add(new ConcludeOrder(o3));
		queue.add(new ConcludeOrder(o4));
		
		queue.process();
	}

	
	
}
