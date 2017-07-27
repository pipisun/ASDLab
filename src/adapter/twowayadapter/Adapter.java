package adapter.twowayadapter;

public class Adapter implements TargetStack, TargetQueue {
	private Adaptee adaptee;

	@Override
	public void push(String str) {
		adaptee.add(str);
	}

	@Override
	public String pop() {
		int end = adaptee.getEnd();
		String str = adaptee.get(end);
		adaptee.remove(end);
		return str;
	}

	@Override
	public boolean isEmpty() {
		return adaptee.empty();
	}

	@Override
	public void offer(String str) {
		// TODO Auto-generated method stub
		adaptee.add(str);
	}

	@Override
	public String poll() {
		int start = adaptee.getStart();
		String str = adaptee.get(start);
		adaptee.remove(start);
		return str;
	}
}
