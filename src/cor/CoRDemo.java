package cor;

public class CoRDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainBuilder cb = new ChainBuilder();
		cb.builderChain();
		
		CallRecord call = new CallRecord();
		Customer customer = new Customer();
		customer.setEmail("customer@customer.com");
		customer.setPhone("123-312-123");
		Address address = new Address();
		customer.setAddress(address);
		
		call.setCustomer(customer);
		cb.getHandler().handleCall(call);
		
	}

}
