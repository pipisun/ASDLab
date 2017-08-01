package builder;

public class BuilderClient {
	public static void main(String[] args) {
		RequestDirector rd = new RequestDirector(new CustomerServiceRequestBuilder());

		rd.setPhone("12301000100");
		rd.setAgent(new Agent("12340001", new Address("N1000 ST.", "Fairfield", "IOWA", "52557")));
		rd.setReqContent("How do I get that software?");
		rd.setRespContent("There is Download button on the website.");
		rd.setAnswered(true);
		rd.setSaleLead(false);
		rd.setSaleLead(false);

		rd.constructRequest();

		Request request = rd.getRequest();
		System.out.println(request);

	}
}
