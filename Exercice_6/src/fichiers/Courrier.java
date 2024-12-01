package fichiers;

public abstract class Courrier {
	private double poids;
	private boolean mode;
	private String adresseDestination;
	
	public Courrier(double poids, boolean mode, String adresseDestination) {
		this.poids = poids;
		this.mode = mode;
		this.adresseDestination = adresseDestination;
	}
	public abstract double affranchir();
	public void affiche() {
		System.out.println("Poids: " + poids + " Gramme");
		System.out.println("Mode d'expédition: " + (mode ? "express":"normal"));
		System.out.println("Adresse de destination: " + adresseDestination);
		if(adresseDestination.isEmpty())
			System.out.println("Courrier invalide");
		else
			System.out.println("Courrier valide");
	}
	
	public double getPoids() {
		return poids;
	}
	public boolean isMode() {
		return mode;
	}

}
