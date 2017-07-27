package prototype;

import java.io.IOException;

public class PrototypeTest {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Supervisor sv1 =new Supervisor("Supervisor1");
		Person p1 = new Person("Songtao Sun");
		p1.setSupervisor(sv1);
		
		System.out.println("P1's Supervisor is " + p1.supervisor.getName());

		Person p2 = (Person) p1.doClone();
		Supervisor sv2 = new Supervisor("Supervisor2");
		p2.setSupervisor(sv2);
		System.out.println("P2's Supervisor is " + p2.supervisor.getName());
		System.out.println("P1's Supervisor is " + p1.supervisor.getName() +" after clone()");

		Employee e1 = new Employee();
		e1.setFirstname("Songtao");
		e1.setSupervisors(sv1);
		System.out.println("E1's Supervisor is " + e1.supervisors.getName());

		Employee e2 = (Employee) e1.deepClone();
		e2.setSupervisors(sv2);
		System.out.println("E2's Supervisor is " + e2.supervisors.getName());
		System.out.println("E1's Supervisor is " + e1.supervisors.getName()+" after deep clone()");

	}
}
