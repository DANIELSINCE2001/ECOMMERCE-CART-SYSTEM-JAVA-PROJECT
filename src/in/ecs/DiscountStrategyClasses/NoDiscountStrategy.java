package in.ecs.DiscountStrategyClasses;


public class NoDiscountStrategy implements DiscountStrategy
{
	
	@Override
	public double applyDiscount(double price,int quantity)
	{
		return price*quantity;
	}

}
