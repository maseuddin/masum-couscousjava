package encapsulation;

public class Mobile {
	private String Brand;
	private int RAM;
	private String color;
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
		
		switch (brand) {
		case "Samsung":
			this.Brand = brand;
			break;
		case "Apple":
			this.Brand = brand;
			break;
		case "Sony":
			this.Brand = brand;
			break;
		default:
			System.out.println("Not a valid brand");
		}
	}
	public int getRAM() {
		return RAM;
	}
	public void setRam(int ram) {
		RAM = ram;
		if(RAM>12)
		{
			System.out.println("Invalid ram size");
		}else {
			this.RAM=RAM;}
		}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}