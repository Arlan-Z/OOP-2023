package Task_5;

public class Parallel extends Circuit{
	private Circuit circuit1;
    private Circuit circuit2;

    public Parallel(Circuit circuit1, Circuit circuit2) {
        this.circuit1 = circuit1;
        this.circuit2 = circuit2;
    }

    @Override
    public double getResistance() {
        return 1 / (1 / circuit1.getResistance() + 1 / circuit2.getResistance());
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDiff = V;
        circuit1.applyPotentialDiff(V);
        circuit2.applyPotentialDiff(V);
    }
}
