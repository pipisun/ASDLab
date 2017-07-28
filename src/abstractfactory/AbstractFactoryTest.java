package abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		
		Address address = new Address("4th N1000", "ST.", "Fairfield", "IOWA", "52557");
		Order order = new Order("Kids", "Bag");
		String customerType = order.getCustomerType();
		String packType = order.getPackType();
		IFactory factory = null;
		if (customerType.equalsIgnoreCase("Business")) {
			if (packType.equalsIgnoreCase("Bag")) {
				factory = new BusinessBagFactory();
			} else if (packType.equalsIgnoreCase("Box")) {
				factory = new BuinessBoxFactory();
			} else if (packType.equalsIgnoreCase("Wrap")) {
				factory = new BusinessWrapFactory();
			}
		} else if (customerType.equalsIgnoreCase("Adults")) {
			if (packType.equalsIgnoreCase("Bag")) {
				factory = new AdultsBagFactory();
			} else if (packType.equalsIgnoreCase("Box")) {
				factory = new AdultsBoxFactory();
			} else if (packType.equalsIgnoreCase("Wrap")) {
				factory = new AdultsWrapFactory();
			}
		} else if (customerType.equalsIgnoreCase("Kids")) {
			if (packType.equalsIgnoreCase("Bag")) {
				factory = new KidsBagFactory();
			} else if (packType.equalsIgnoreCase("Box")) {
				factory = new KidsBoxFactory();
			} else if (packType.equalsIgnoreCase("Wrap")) {
				factory = new KidsWrapFactory();
			}
		}

		Packaging packaging = factory.produce();

		GiftItem giftitem = new GiftItem(packaging, "1", "Plane Model", "Modeling", packType);

		List<GiftItem> giftItems = new ArrayList<GiftItem>();
		giftItems.add(giftitem);

		GiftPack giftpack = new GiftPack(giftItems, address, customerType);
		
		for (int i=0;i<giftpack.getGiftItems().size();i++){
			
			Packaging packagingsent = giftpack.getGiftItems().get(i).getPackaging();
			String giftId = giftpack.getGiftItems().get(i).getGiftId();
			String giftName = giftpack.getGiftItems().get(i).getGiftName();
			String description = giftpack.getGiftItems().get(i).getDescription();
			String packTypesent = packagingsent.getPackType();
			float packCostsent = packagingsent.getCost();
			
			System.out.println("Gift Id:" + giftId);
			System.out.println("Gift Name:" + giftName);
			System.out.println("Description:" + description);
			System.out.println("Package Type:" + packTypesent);
			System.out.println("Package Cost:" + packCostsent);
			
		}
	}
}
