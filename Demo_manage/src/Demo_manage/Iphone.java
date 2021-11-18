package Demo_manage;

public class Iphone extends Product {

	public Iphone(String code, String name, float quantity, float price) {
		super(code, name, quantity, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	float money() {
		// TODO Auto-generated method stub
		float summoney = (float)(getPrice()*getQuantity()*(1-0.2));
		return summoney;
	}

}
