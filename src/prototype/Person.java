package prototype;

public class Person implements Prototype, Cloneable {
	String name;
	Supervisor supervisor;

	
	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Prototype doClone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
//		return new Person(name);
		return (Prototype)super.clone();
	}

	public String toString() {
		return name;
	}

}
