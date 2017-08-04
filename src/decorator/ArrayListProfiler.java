package decorator;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProfiler extends Decorator{

    @SuppressWarnings("rawtypes")
	@Override
    public List getTarget() {
        return new ArrayList();
    }

    @Override
    public void execute() {
        System.out.println("ArrayList test start:");
    }
}
