package decorator;

import java.util.ArrayList;
import java.util.List;

public class LinkedListProfiler extends Decorator{

    @SuppressWarnings("rawtypes")
	@Override
    public List getTarget() {
        return new ArrayList();
    }

    @Override
    public void execute() {
        System.out.println("LinkedList test start:");
    }
}
