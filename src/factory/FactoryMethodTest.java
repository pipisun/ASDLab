package factory;

public class FactoryMethodTest {

	public static void main(String[] args) {
		
		String debugMsg = "Debug message";
		String errorMsg = "Error message";

		Factory factory = new Factory();
		Trace trace = factory.produce(args[0]);
		trace.setDebug(true);
		trace.debug(debugMsg);
		trace.error(errorMsg);
	}
}
