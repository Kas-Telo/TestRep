package by.jonline.module4.agregation_and_composition.task03;

public class Main {

	public static void main(String[] args) {
		Country countryBel = new Country("Belarus");
		
		CountryLogic logic = new CountryLogic(countryBel);
		
		logic.addRegion("Минская");
		logic.addDistrict("Минская", "Минский");
		
		System.out.println(countryBel);

	}

}
