package decorator;

import java.util.List;

public class AddDecorator extends Decorator{
    protected Decorator toBeDecorated;

    public AddDecorator(Decorator toBeDecorated) {
        this.toBeDecorated = toBeDecorated;
    }

    @SuppressWarnings("rawtypes")
	@Override
    public List getTarget() {
        return this.toBeDecorated.getTarget();
    }

    @SuppressWarnings("unchecked")
	@Override
    public void execute() {
        this.toBeDecorated.execute();
        this.getTarget().add(new Object());
        executeAdd();
    }

    public void executeAdd() {
        System.out.println("Additional AddDecorator execute test is done");
    }
}
