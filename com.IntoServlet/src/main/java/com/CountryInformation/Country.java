package com.CountryInformation;

public class Country
{
	private String name;
	private int NumberOfStates;
	private String Capital;
	private String pm;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfStates() {
		return NumberOfStates;
	}
	public void setNumberOfStates(int numberOfStates) {
		NumberOfStates = numberOfStates;
	}
	public String getCapital() {
		return Capital;
	}
	public void setCapital(String capital) {
		Capital = capital;
	}
	public String getPm() {
		return pm;
	}
	public void setPm(String pm) {
		this.pm = pm;
	}
	
	@Override
	public String toString() {
		return "Country [name=" + name + ", NumberOfStates=" + NumberOfStates + ", Capital=" + Capital + ", pm=" + pm
				+ "]";
	}
}
