package by.jonline.module4.agregation_and_composition.task03;

public class Country {
	
	private String name;
	private Region[] region; 
	
	
	public Country(String name) {
		super();
		this.name = name;
	}
	
	public Region[] getRegion() {
		return region;
	}
	

	public void setRegion(Region[] region) {
		this.region = region;
	}
	

	@Override
	public String toString() {
		return name;
	}
	
	
}
