package observer;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		Name name1 = new Name("James", "Jone");
		Name name2 = new Name("Tina", "Allison");

		List<Name> names = new ArrayList<Name>();
		names.add(name1);
		names.add(name2);
		NameData namedata = new NameData();
		namedata.setNameData(names);
		UIshower uishower = new UIshower(namedata);
		uishower.update(names);
		uishower.display();
		
		System.out.println("Removing: " + name2.getFirstName() + " " + name2.getLastName());
		names.remove(name2);
		System.out.println("Update names and notify UI:");
		uishower.update(names);
		uishower.display();
	}
}
