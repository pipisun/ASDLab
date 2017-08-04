package decorator;

import java.util.List;

public class SizeDecorator extends Decorator{
    protected Decorator toBeDecorated;

    public SizeDecorator(Decorator toBeDecorated) {
        this.toBeDecorated = toBeDecorated;
    }

    @SuppressWarnings("rawtypes")
	@Override
    public List getTarget() {
        return this.toBeDecorated.getTarget();
    }

    @Override
    public void execute() {
        this.toBeDecorated.execute();
        this.getTarget().size();
        executeSize();
    }

    public void executeSize() {
        System.out.println("Additional SizeDecorator execute test is done");
    }
}
