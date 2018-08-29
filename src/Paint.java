
public class Paint {
	private double cost;
	private int coverPerLitre;
	private String name;
	private int litre;
	
	public Paint(String name, int litre, double cost, int coverPerLitre) {
		this.name = name;
		this.litre = litre;
		this.cost = cost;
		this.coverPerLitre = coverPerLitre;
	}
	
	public String getPaint () {
		return this.name;
	}
	
	public int fullCoverage () {
		return (this.coverPerLitre*this.litre);
	}
	
	public double getCost() {
		return this.cost;
	}
}
