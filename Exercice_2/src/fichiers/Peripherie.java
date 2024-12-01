package fichiers;

public class Peripherie extends ProduitInformatique {
	private double resolution;
	
	public Peripherie(String reference, String marque, Date date, int prix, double resolution) {
		super(reference, marque, date, prix);
		this.resolution = resolution;
	}
	
	@Override
    public void afficher() {
        super.afficher();
        System.out.println("Résolution : " + resolution + " pixel");
    }
}

