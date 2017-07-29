package cor;

public class ChainBuilder {
	private AbstractProcess handler;
	
	public void builderChain(){
		AbstractProcess validator = new Validator();
		AbstractProcess dataWasher = new DataWasher();
		AbstractProcess reporter = new Reporter();
		validator.nextAgent = dataWasher;
		dataWasher.nextAgent = reporter;
		handler = validator;
	}

	public AbstractProcess getHandler() {
		return handler;
	}

	public void setHandler(AbstractProcess handler) {
		this.handler = handler;
	}
	
	

}
