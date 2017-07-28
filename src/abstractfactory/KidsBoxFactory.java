package abstractfactory;

public class KidsBoxFactory implements IFactory {

	@Override
	public Packaging produce() {
		// TODO Auto-generated method stub
		return new KidsBoxProduct();
	}

}
