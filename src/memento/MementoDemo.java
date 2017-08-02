package memento;

public class MementoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User originUser = new User("James", "Jones");
		CareTaker careTaker = new CareTaker();
		careTaker.add(new Memento(originUser));
		System.out.println("User name is:" + originUser.getFirstName() + " " + originUser.getLastName());
		
		//Update the user info
		User updatedUser = new User("NotJames", "NotJones");
		System.out.println("User name now is:" + updatedUser.getFirstName() + " " + updatedUser.getLastName());
		
		//Undo the update
		User oUser = careTaker.getMemento(0).getUser();
		System.out.println("Original User name is:" + oUser.getFirstName() + " " + oUser.getLastName());
		
	}

}
