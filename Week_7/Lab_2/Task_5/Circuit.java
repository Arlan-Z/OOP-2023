package Task_5;

public abstract class Circuit {
	protected double potentialDiff;
	
	public abstract double getResistance();
	
	public  double getPotentialDiff()
	{
		return potentialDiff;
	}	
	
	public abstract void applyPotentialDiff(double V);
	
	public double getPower()
	{
		return potentialDiff * potentialDiff / getResistance();
	}
	
	public double getCurrent()
	{
		return potentialDiff / getResistance();
	}
}
