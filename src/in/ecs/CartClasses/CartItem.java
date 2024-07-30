package in.ecs.CartClasses;
import in.ecs.ProductClasses.Product;
import in.ecs.DiscountStrategyClasses.DiscountStrategy;
import in.ecs.DiscountStrategyClasses.NoDiscountStrategy;	

class CartItem
{
	private Product product;
	private int quantity;
	private DiscountStrategy discountStrategy;
	
	
	public CartItem(Product product ,int quantity)
	{
		this.product=product;
		this.quantity=quantity;
		this.discountStrategy=new NoDiscountStrategy();
	}
		
		public Product getProduct()
		{
			return product;
		}
		
		public int getQuantity()
		{
			return quantity;
		}
		
		public void setQuantity(int quantity) 
		{
			this.quantity=quantity;
			
		}
		
		public void setDiscountStrategy(DiscountStrategy discountStrategy)
		{
			this.discountStrategy=discountStrategy;
		}
		
		public double getTotalPrice()
		{
			return discountStrategy.applyDiscount(product.getPrice(), quantity);
		}
		
		
		@Override 
		public String toString()
		{
			return product.getName()+" x" +quantity +" @ $" +product.getPrice()+" each";
		}

		
	
}
