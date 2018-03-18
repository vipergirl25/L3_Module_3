package abstract_classes.cities;

public class SanDiego extends City {
	double taxes;
	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		
	}
	public double getAnnualTaxes() {
		taxes = (population*growthRate) + 1000000;
		return taxes;
		}
}
