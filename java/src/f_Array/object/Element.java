/**
 * Arrays of Objects
 */

package f_Array.object;

public class Element {
	private String name;
	private String symbol;
	private double weight;
	private int period;
	private int group;
	
	public Element(String name, String symbol, double weight, int period, int group) {
		this.name = name;
		this.symbol = symbol;
		this.weight = weight;
		this.period = period;
		this.group = group;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	
	
}
