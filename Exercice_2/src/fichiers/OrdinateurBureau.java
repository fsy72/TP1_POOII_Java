package fichiers;

public class OrdinateurBureau extends Ordinateur{
	private String carteGraphique;
	
	public OrdinateurBureau(String reference, String marque, Date date, int prix, String processeur, double ram, double disqueDur, String sysdExploitatoin,
			String carteGraphique) {
		super(reference, marque, date, prix, processeur, ram, disqueDur, sysdExploitatoin);
		this.carteGraphique = carteGraphique;
	}
	
	@Override
    public void afficher() {
		System.out.println("Ordinateur bureau :");
        super.afficher();;
        System.out.println("Carte graphique : " + carteGraphique);
    }
}

