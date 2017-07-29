package cor;

public class DataWasher extends AbstractProcess {

	@Override
	public void handleCall(CallRecord call) {
		// TODO Auto-generated method stub
		// do some analysis on each request and generate sales leads
		// before passing them to the third/last process
		if (this.nextAgent != null) {
			System.out.println("Analysis done!");
			this.nextAgent.handleCall(call);
		}
			
	}

}
