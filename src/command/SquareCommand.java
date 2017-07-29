package command;

public class SquareCommand implements Command {
	private Square square;

	public SquareCommand(String commands) {
		this.square = new Square(StringSplit.getValue(commands));
	}

	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		return square.paint();
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return square.unpaint();
	}

}
