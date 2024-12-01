package fichiers;

public class ProduitInformatique {
	private String reference;
    private String marque;
    private Date dateFabrication;
    private int prix;

	public ProduitInformatique(String reference, String marque, Date date, int prix) {
		super();
		this.reference = reference;
		this.marque = marque;
		this.dateFabrication = date;
		this.prix = prix;
	}
	
	public void afficher() {
        System.out.println("Référence : " + reference);
        System.out.println("Marque : " + marque);
        System.out.println("Date de fabrication : " + dateFabrication);
        System.out.println("Prix : " + prix + " €");
    }

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Date getDate() {
		return dateFabrication;
	}

	public void setDate(Date date) {
		this.dateFabrication = date;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
    
    
}
