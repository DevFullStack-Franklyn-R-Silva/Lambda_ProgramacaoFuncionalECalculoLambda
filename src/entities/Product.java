package entities;

public class Product  {
	
	private String name;
	private Double price;
	
	public Product() {}
	public Product(String name, Double preco) {
		this.name = name;
		this.price = preco;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [nome=" + name + ", preco=" + price + "]";
	}
	
	
	
}
