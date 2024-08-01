package in.ecs.MainClass;

import in.ecs.CartClasses.*;
import in.ecs.ProductClasses.*;
import in.ecs.DiscountStrategyClasses.*;

public class ECommerceCartSystem
{

	public static void main(String[] args)throws CloneNotSupportedException
	{
		Cart cart =new Cart();
		
		Product laptop =new Laptop(1000,true);
		Product headphones=new Headphones(50,true);
		
		
		System.out.println("Available Products:");
		System.out.println(laptop.getName() + ": $" +laptop.getPrice()+"-"+(laptop.isAvailable() ? "Avilable" : "Out of Stock"));
		System.out.println(headphones.getName() + ": $"+headphones.getPrice() + "-"+(headphones.isAvailable() ? "Available" : "Out of Stock"));
		
		
		cart.addProduct(laptop, 1);
		cart.addProduct(headphones, 1);
		cart.displayCartItems();
		
		cart.updateProductQuantity("Laptop", 2);
        	cart.displayCartItems();
		
		cart.applyDiscountToProduct("Laptop",new PercentageDiscountStrategy(10));
		cart.applyDiscountToProduct("Headphones", new BuyOneGetOneFreeStrategy());
		cart.displayCartItems();
		
		
		cart.removeProduct("Headphones");
		cart.displayCartItems();
		

	}

}
