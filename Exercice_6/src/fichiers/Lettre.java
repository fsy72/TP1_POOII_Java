package fichiers;

public class Lettre extends Courrier {
	private String format;

	public Lettre(double poids, boolean mode, String adresseDestination, String format) {
		super(poids, mode, adresseDestination);
		this.format = format;
	}
	public double affranchir() {
		double aff = (format=="A4" ? 2.50:3.50) + 1.0*super.getPoids();
		if(!super.isMode())
			return aff;
		return 2*aff;
	}
	public void affiche() {
		super.affiche();
		System.out.println("Format: " + format);
	}
}
