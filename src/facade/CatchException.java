package facade;

import java.sql.SQLException;

public class CatchException implements ICatch {

	@Override
	public void processCatch(Object obj) {
		if (obj instanceof SQLException) {
			((SQLException) obj).printStackTrace();
		} else if (obj instanceof InstantiationException) {
			((InstantiationException) obj).printStackTrace();
		} else if (obj instanceof ClassNotFoundException) {
			((ClassNotFoundException) obj).printStackTrace();
		} else if (obj instanceof IllegalAccessException) {
			((IllegalAccessException) obj).printStackTrace();
		} else {
			((Exception) obj).printStackTrace();
		}
	}
}
