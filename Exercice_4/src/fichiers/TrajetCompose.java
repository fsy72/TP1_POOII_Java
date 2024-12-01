package fichiers;

import java.util.Vector;

public class TrajetCompose {
	private Voyage[] voyage;
	private int nombreMax;
	private int nombreActuel;
	
	public TrajetCompose(int nombreMax) {
		this.nombreMax = nombreMax;
		voyage = new Voyage[nombreMax];
		nombreActuel = 0;
	}
	
	public void ajoute(Voyage v) {
		if(nombreActuel < nombreMax)
			voyage[nombreActuel++] = v;
	}
	
	public double dureeCumulee() {
		double dureeTotal = 0;
		for(int i=0; i<nombreActuel; i++) {
			dureeTotal += voyage[i].dureeCumullee();
		}
		return dureeTotal;
	}
	
	Vector<String> ListeLieu() {
		Vector<String> lieux = new Vector<>();
		for(int i=0; i<nombreActuel; i++) {
			lieux.addAll(voyage[i].ListeLieu());
		}
		return lieux;
	}
}
