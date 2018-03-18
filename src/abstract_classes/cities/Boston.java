package abstract_classes.cities;

public class Boston extends City{
	double taxes;
	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	public double getAnnualTaxes() {
		taxes = (population*growthRate)+population*.5;
		return taxes;
	}

}
