package fichiers;

public class Colis extends Courrier {
	private double volume;

	public Colis(double poids, boolean mode, String adresseDestination, double volume) {
		super(poids, mode, adresseDestination);
		this.volume = volume;
	}
	public double affranchir() {
		double aff = 0.25*volume + 1.0*super.getPoids();
		if(!super.isMode())
			return aff;
		return 2*aff;
	}
	public void affiche() {
		super.affiche();
		System.out.println("Volume: " + volume + " litres");
	}
}
