package fichiers;

public class Ordinateur extends ProduitInformatique{
	private String processeur;
	private double RAM;
	private double disqueDur;
	private String sysdExploitatoin;
	
	public Ordinateur(String reference, String marque, Date date, int prix, String processeur, double ram, double disqueDur, String sysdExploitatoin) {
		super(reference, marque, date, prix);
		this.processeur = processeur;
		this.RAM = ram;
		this.disqueDur = disqueDur;
		this.sysdExploitatoin = sysdExploitatoin;
	}
	
	@Override
    public void afficher() {
        super.afficher();
        System.out.println("Processeur : " + processeur);
        System.out.println("RAM : " + RAM + " Go");
        System.out.println("Disque dur : " + disqueDur + " Go");
        System.out.println("Systeme d'exploitation : " + sysdExploitatoin);
    }
}

