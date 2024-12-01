package fichiers;

import java.util.Vector;

public abstract class Voyage {
	private String intitule;

	public Voyage(String intitule) {
		this.intitule = intitule;
	}
	
	abstract public double dureeCumullee();

	@Override
	public String toString() {
		return "Voyage [intitule=" + intitule + "]";
	}
	abstract Vector<String> ListeLieu();
}
