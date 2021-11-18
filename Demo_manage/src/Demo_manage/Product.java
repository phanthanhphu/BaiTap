package Demo_manage;

public abstract class Product {
       private String code;
       private String name;
       private float quantity;
       private float price;
       abstract float money();
       
       public  Product(String code, String name, float quantity, float price) {
         setCode(code);
         setName(name);
         setQuantity(quantity);
         setPrice(price);
    }
       


	String getCode() {
		return code;
	}
	void setCode(String code) {
		this.code = code;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	float getQuantity() {
		return quantity;
	}
	void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	float getPrice() {
		return price;
	}
	void setPrice(float price) {
		this.price = price;
	}
}

