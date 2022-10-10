package builder.pizzaria;

public class Pizza {
	
	private Integer size = 0;
	
	private Boolean flagCheese = false;
	
	private Boolean flagPepperoni = false;
	
	public Integer getSize() {
		return size;
	}
	
	public Boolean getFlagCheese() {
		return flagCheese;
	}
	
	public Boolean getFlagPepperoni() {
		return flagPepperoni;
	}
	
	public void setSize(Integer size) {
		this.size = size;
	}
	
	public void setFlagCheese(Boolean flagCheese) {
		this.flagCheese = flagCheese;
	}
	
	public void setFlagPepperoni(Boolean flagPepperoni) {
		this.flagPepperoni = flagPepperoni;
	}

}
