package abstract_classes.cities;

public class LosAngeles extends City {
	double taxes;
	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);

	}

	@Override
	public double getAnnualTaxes() {
		taxes = (population*growthRate) + (0.5*growthRate);
		return taxes;
	}

}
