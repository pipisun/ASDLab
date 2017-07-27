package adapter.twowayadapter;

public interface TargetQueue {
    public void offer(String str);
    public String poll();
    public boolean isEmpty();
}
