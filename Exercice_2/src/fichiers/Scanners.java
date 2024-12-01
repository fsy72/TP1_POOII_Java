package fichiers;

public class Scanners extends Peripherie {
	private int nombrePages;
	
	public Scanners(String reference, String marque, Date date, int prix, double resolution, int nombrePages) {
		super(reference, marque, date, prix, resolution);
		this.nombrePages = nombrePages;
	}
	
	@Override
    public void afficher() {
		System.out.println("Scanner :");
        super.afficher();
        System.out.println("Nombre de pages à scanner : " + nombrePages);
    }
}
