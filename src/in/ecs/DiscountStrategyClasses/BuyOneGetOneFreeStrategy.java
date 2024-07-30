package in.ecs.DiscountStrategyClasses;

public class BuyOneGetOneFreeStrategy implements DiscountStrategy 
{
	@Override
	public double applyDiscount(double price,int quantity)
	{
		int effectiveQuantity =(quantity /2) + (quantity % 2);
		return price * effectiveQuantity;
	}
}
