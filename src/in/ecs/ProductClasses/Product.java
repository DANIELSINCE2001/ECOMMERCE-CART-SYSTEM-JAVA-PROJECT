package in.ecs.ProductClasses;

public abstract class Product implements Cloneable {

	private String name;
	private double price;
	private boolean available;
	
	public Product(String name,double price,boolean available)
	{
		this.name=name;
		this.price=price;
		this.available=available;
	}

	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public boolean isAvailable() {
		return available;
	}
	
	@Override
	public Product clone()throws CloneNotSupportedException
	{
		return (Product)super.clone();
	}

}
