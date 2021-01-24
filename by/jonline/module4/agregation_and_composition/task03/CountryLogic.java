package by.jonline.module4.agregation_and_composition.task03;

public class CountryLogic {
	private Country country;
	
	public CountryLogic(Country country) {
		super();
		this.country = country;
	}
	
	
	public void addRegion(String name) {
		Region[] newRegion;
		int i = 0;
		
		if(country.getRegion() == null) {
			newRegion = new Region[1];
		}else {
			i = country.getRegion().length + 1;
			
			newRegion = new Region[i];
			for(int j = 0; j < country.getRegion().length; j++) {
				newRegion[j] = country.getRegion()[j];
			}
		}
		
		newRegion[i] = new Region(name);
		
		country.setRegion(newRegion);
	}
	
	public void addDistrict(String nameOfRegion, String name) {
		for(int i = 0; i < country.getRegion().length; i++) {
			if(nameOfRegion.equals(country.getRegion()[i].toString())) {
				country.getRegion()[i].addDistrict(name);
			}
		}
	}
	
	public 
}
