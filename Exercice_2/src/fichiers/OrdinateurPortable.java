package fichiers;

public class OrdinateurPortable extends Ordinateur{
	private double tailleEcran;
	
	public OrdinateurPortable(String reference, String marque, Date date, int prix, String processeur, int tailleRAM, int tailleDisque, String sysdExploitatoin,
			String typeEcran, double tailleEcran) {
		super(reference, marque, date, prix, processeur, tailleRAM, tailleDisque, sysdExploitatoin);
		this.tailleEcran = tailleEcran;
	}
	
	@Override
    public void afficher() {
		System.out.println("Ordinateur portable :");
        super.afficher();
        System.out.println("Taille ecran : " + tailleEcran);
    }
}

