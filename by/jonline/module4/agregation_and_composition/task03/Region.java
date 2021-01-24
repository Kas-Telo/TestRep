package by.jonline.module4.agregation_and_composition.task03;

public class Region {
	private String name;
	public District[] district;;
	
	public Region(String name) {
		super();
		this.name = name;
	}
	
	public void addDistrict(String name) {
		District[] newDistrict;
		int i = 0;
		
		if(district == null) {
			newDistrict = new District[1];
		}else {
			i = district.length + 1;
			
			newDistrict = new District[i];
			
			for(int j = 0; j < district.length; j++) {
				newDistrict[j] = district[j];
			}
		}
		
		
		
		newDistrict[i] = new District(name);
		
		district = newDistrict;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
