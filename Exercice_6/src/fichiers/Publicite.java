package fichiers;

public class Publicite extends Courrier{
	public Publicite(double poids, boolean mode, String adresseDestination) {
		super(poids, mode, adresseDestination);
	}
	public double affranchir() {
		double aff = 5.0*super.getPoids();
		if(!super.isMode())
			return aff;
		return 2*aff;
	}
	public void affiche() {
		super.affiche();
	}
}
