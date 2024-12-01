package fichiers;

public class Imprimante extends Peripherie{
	private String type;
	private double vitesseImpression;
	
	public Imprimante(String reference, String marque, Date date, int prix, String type, double resolution, double vitesseImpression) {
		super(reference, marque, date, prix, resolution);
		this.type = type;
		this.vitesseImpression = vitesseImpression;
	}
	
	@Override
    public void afficher() {
		System.out.println("Imprimante :");
        super.afficher();
        System.out.println("Type : " + type);
        System.out.println("Vitesse d'impression : " + vitesseImpression + " page/seconde");
    }
}
