package cor;

public abstract class AbstractProcess {
	protected AbstractProcess nextAgent;

	abstract public void handleCall(CallRecord call);

	boolean canHandleCall(CallRecord call) {
		return true;
	}
}
