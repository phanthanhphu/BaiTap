package Demo_manage;

public class Electric extends Product {

	public Electric(String code, String name, float quantity, float price) {
		super(code, name, quantity, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	float money() {
		// TODO Auto-generated method stub
		float summoney = (float) (getQuantity()*getPrice()*(1-0.1));
		return summoney;
	}
	

}
