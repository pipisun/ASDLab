package command;

public class MoveCommand implements Command {
	private Move move;

	public MoveCommand(int areaSize, String commands) {
		this.move = new Move(areaSize, StringSplit.getValue(commands));
	}

	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		return move.move();
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return move.unmove();
	}

}
