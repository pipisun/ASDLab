package iterator;

public class IteratorMain {
	public static void main(String[] args) {
		Aggregate aggregate = new NameRepository();
		Iterator iterator = aggregate.getIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("The first Name:" + iterator.first());
		System.out.println("The last Name:" + iterator.last());
	}
}
