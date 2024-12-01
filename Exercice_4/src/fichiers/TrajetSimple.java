package fichiers;

import java.util.Vector;

public class TrajetSimple extends Voyage {
	private String lieuDepart;
	private String lieuArrivee;
	private double duree;
	
	public TrajetSimple(String intitule, String lieuDepart, String lieuArrivee, double duree) {
		super(intitule);
		this.lieuDepart = lieuDepart;
		this.lieuArrivee = lieuArrivee;
		this.duree = duree;
	}

	public double dureeCumullee() {
		return duree;
	}
	
	Vector<String> ListeLieu() {
		Vector<String> lieux = new Vector<>();
		lieux.add(this.lieuDepart);
		lieux.add(this.lieuArrivee);
		return lieux;
	}

	@Override
	public String toString() {
		return "TrajetSimple [duree=" + duree + "]";
	}
}
