
public class Card {
	
	private int countryId;
	private String countryName;
	private String unitType;

	Card (int inCountryId, String inCountryName, String inUnitType) {   
		countryId = inCountryId;
		countryName = inCountryName;
		unitType = inUnitType;
		return;
	}
	
	public int getCountryId () {
		return countryId;
	}
	
	public String getCountryName () {
		return countryName;
	}
	
	public String getUnitType () {
		return unitType;
	}
	
}
