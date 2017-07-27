package template;

import java.util.List;

public abstract class AbstractTemplate {
	
	protected abstract String getList(List<String> list);
	protected abstract String reconstructLetter(List<String> list, String symmetry);
	protected abstract void printLetter(String str);
	
	public final void processReconstruct(List<String> list) {
		String str = getList(list);
		String strCompleted = reconstructLetter(list, str);
		printLetter(strCompleted);
	}
}
