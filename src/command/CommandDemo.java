package command;

public class CommandDemo {

	public static void main(String[] args) {

		String strCommand = "Create 5";
		Command squareCommand = new SquareCommand(strCommand);
		squareCommand.execute();
		squareCommand.undo();
		System.out.println();

		String strScaleCommand = "Scale 2";
		Command scaleCommand = new ScaleCommand(StringSplit.getValue(strCommand), strScaleCommand);
		scaleCommand.execute();
		scaleCommand.undo();
		System.out.println();

		String strMoveCommand = "Move right 3";
		Command moveCommand = new MoveCommand(StringSplit.getValue(strCommand), strMoveCommand);
		moveCommand.execute();
		moveCommand.undo();
	}

}
