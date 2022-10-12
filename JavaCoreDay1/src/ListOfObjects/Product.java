package ListOfObjects;

public class Product {
	String name;
	int price;
	int quantity;
	String brand;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Product(String name, int price, int quantity, String brand) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + ", brand=" + brand + "]";
	}

	
}
