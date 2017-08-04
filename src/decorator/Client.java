package decorator;

public class Client {
	public static void main(String[] args) {
		Decorator d1 = new AddDecorator(new AddDecorator(new ArrayListProfiler()));
		d1.execute();

		Decorator de4 = new SizeDecorator(new SizeDecorator(new LinkedListProfiler()));
		de4.execute();

	}
}
