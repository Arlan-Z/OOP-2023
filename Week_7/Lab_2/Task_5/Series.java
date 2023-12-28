package Task_5;

public class Series extends Circuit{
	 private Circuit circuit1;
	    private Circuit circuit2;

	    public Series(Circuit circuit1, Circuit circuit2) {
	        this.circuit1 = circuit1;
	        this.circuit2 = circuit2;
	    }

	    @Override
	    public double getResistance() {
	        return circuit1.getResistance() + circuit2.getResistance();
	    }

	    @Override
	    public void applyPotentialDiff(double V) {
	        this.potentialDiff = V;
	        double current = getCurrent();
	        circuit1.applyPotentialDiff(current * circuit1.getResistance());
	        circuit2.applyPotentialDiff(current * circuit2.getResistance());
	    }
}
