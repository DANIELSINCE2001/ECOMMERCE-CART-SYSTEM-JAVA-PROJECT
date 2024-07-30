package in.ecs.DiscountStrategyClasses;

public class PercentageDiscountStrategy implements DiscountStrategy 
{
	private final double percentage;
	
	public PercentageDiscountStrategy(double percentage)
	{
		this.percentage=percentage;
		
	}
	
	@Override
	public double applyDiscount(double price,int quantity)
	{
		double discount =(price*percentage)/100;
		return (price - discount)*quantity;	
	}
}
