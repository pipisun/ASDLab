package decorator;

import java.util.List;

public class ContainDecorator extends Decorator{
    protected Decorator toBeDecorated;

    public ContainDecorator(Decorator toBeDecorated) {
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
        this.getTarget().contains(new Object());
        executeContain();
    }

    public void executeContain() {
        System.out.println("Additional ContainDecorator execute test is done");
    }
}
