package decorator;

import java.util.List;

public class RemoveDecorator extends Decorator{
    protected Decorator toBeDecorated;

    public RemoveDecorator(Decorator toBeDecorated) {
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
        this.getTarget().remove(0);
        executeRemove();
    }

    public void executeRemove() {
        System.out.println("Additional RemoveDecorator execute test is done");
    }
}
