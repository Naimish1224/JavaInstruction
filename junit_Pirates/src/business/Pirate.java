package business;

public class Pirate {

	private String name;
	private int limbsRemaining;
	private static int numPirates;
	private static int totalLimbsLost;
	public Pirate(String name, int limbsRemaining) {
		super();
		this.name = name;
		this.limbsRemaining = limbsRemaining;
	}
	public Pirate() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLimbsRemaining() {
		return limbsRemaining;
	}
	public void setLimbsRemaining(int limbsRemaining) {
		this.limbsRemaining = limbsRemaining;
	}
	public static int getNumPirates() {
		return numPirates;
	}
	public static void setNumPirates(int numPirates) {
		Pirate.numPirates = numPirates;
	}
	public static int getTotalLimbsLost() {
		return totalLimbsLost;
	}
	public static void setTotalLimbsLost(int totalLimbsLost) {
		Pirate.totalLimbsLost = totalLimbsLost;
	}
	@Override
	public String toString() {
		return "Pirate '" + name + "'has" + limbsRemaining + "limbsRemaining.";
	}
	
	
}
