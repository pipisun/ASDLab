package command;

public class ScaleCommand implements Command {
	private Scale scale;
	
	public ScaleCommand(int areaSize, String commands) {
		this.scale = new Scale(areaSize, StringSplit.getValue(commands));
	}

	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		return scale.scale();
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return scale.unscale();
	}

}
