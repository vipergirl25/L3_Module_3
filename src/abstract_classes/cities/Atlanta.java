package abstract_classes.cities;

public class Atlanta extends City {
	double taxes;
	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	public double getAnnualTaxes() {
		taxes = population*growthRate*2;
		return taxes;
	}

}
