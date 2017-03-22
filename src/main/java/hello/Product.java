package hello;

public class Product {
	String category;
	String name;
	public Product(String cat, String name){
		this.category = cat;
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [category=" + category + ", name=" + name + "]";
	}
}
