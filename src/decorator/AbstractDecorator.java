package decorator;

import java.util.List;

public abstract class AbstractDecorator extends Decorator{
    protected Decorator toBeDecorated;

    public AbstractDecorator(Decorator toBeDecorated) {
        this.toBeDecorated = toBeDecorated;
    }

    @SuppressWarnings("rawtypes")
	@Override
    public List getTarget() {
        return this.toBeDecorated.getTarget();
    }

    @Override
    public void execute() {
        System.out.println("AbstractDecorator test start:");
    }
}
