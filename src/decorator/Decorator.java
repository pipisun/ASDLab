package decorator;

import java.util.List;

public abstract class Decorator {
    @SuppressWarnings("rawtypes")
	public abstract List getTarget();
    public abstract void execute();
}
