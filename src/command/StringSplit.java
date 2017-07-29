package command;

public class StringSplit {

	public static int getValue(String str) {
		String[] arr = str.split(" ");
		int len = arr.length;
		return Integer.parseInt(arr[len - 1]);
	}
}
