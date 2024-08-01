package in.ecs.CartClasses;

import in.ecs.DiscountStrategyClasses.DiscountStrategy;
import in.ecs.ProductClasses.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Cart
{
	private final List<CartItem> items;
	
	
	public Cart()
	{
		this.items = new ArrayList<>();
	}
	
	public void addProduct(Product product,int quantity)throws CloneNotSupportedException
	{
		for(CartItem item : items)
		{
			if(item.getProduct().getName().equals(product.getName()))
			{
				item.setQuantity(item.getQuantity() + quantity);
				item.setQuantity(item.getQuantity() + quantity);
				System.out.println(quantity + " "+product.getName() +"(s) added to the cart.");
				return;
			}
		}
		
		items.add(new CartItem(product.clone(),quantity));
		System.out.println(product.getName() +" added to the cart.");
	}
		
	public void updateProductQuantity(String productName,int quantity)
	{
		for(CartItem item :items)
		{
			if(item.getProduct().getName().equals(productName))
			{
				item.setQuantity(quantity);
				System.out.println("Updated quantity for "+ productName +" to "+ quantity);
				return;
			}
		}
		System.out.println(productName +" not found in the cart.");
	}
	
	
	public void removeProduct(String productName)
	{
		for(Iterator<CartItem> iterator =items.iterator();iterator.hasNext();)
		{
			CartItem item=iterator.next();
			if(item.getProduct().getName().equals(productName))
			{
				iterator.remove();
				System.out.println(productName +" removed from the cart.");
				return;
			}
		}
		System.out.println(productName +" not found in the cart.");
	}
	
	public void applyDiscountToProduct(String productName,DiscountStrategy discountStrategy)
	{
		for(CartItem item : items)
		{
			if(item.getProduct().getName().equals(productName))
			{
				item.setDiscountStrategy(discountStrategy);
				System.out.println("Applied discount to " + productName);
				return;
			}
		}
		System.out.println(productName + " not found in the cart .");
		
	}
	
	public double calculateTotalBill()
	{
		double total=0;
		for(CartItem item: items)
		{
			total+=item.getTotalPrice();
		}
		return total;
	}
	
	
	public void displayCartItems()
	{
		if(items.isEmpty())
		{
			System.out.println("Cart is empty. ");
			return;
		}
		System.out.println("Cart Items:");
		for(CartItem item : items)
		{
			System.out.println(item);
		}
		System.out.println("Total Bill : $" + calculateTotalBill());
	}
	
	
	
	
		
	
}
