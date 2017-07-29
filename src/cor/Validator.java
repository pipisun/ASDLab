package cor;

public class Validator extends AbstractProcess {

	Customer customer;
	Address address;

	@Override
	public void handleCall(CallRecord call) {
		// TODO Auto-generated method stub
		customer = call.getCustomer();
		String email = customer.getEmail();
		String phone = customer.getPhone();
		address = customer.getAddress();

		if ((email != null && !"".equals(email)) && (phone != null && !"".equals(phone)) && address != null) {
			call.setValid(true);
			System.out.println("Validation completed!");
			
			if (this.nextAgent != null)
				this.nextAgent.handleCall(call);
		} else {
			call.setValid(false);
			// Generate the discarded requeests files.
			call.discardedrequests(call);
		}

	}

}
