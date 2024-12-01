package fichiers;

public class ListeProduit {
	private ProduitInformatique[] produits;
	private int tailleMax;
	private int tailleEffective;

	public ListeProduit(int tailleMax) {
		this.produits = new ProduitInformatique[tailleMax];
		this.tailleMax = tailleMax;
		this.tailleEffective = 0;
	}
	
	public void ajout(ProduitInformatique produit) {
		if(tailleEffective < tailleMax)
			produits[tailleEffective++] = produit;
	}
	
	public void affiche() {
		for(int i=0; i<tailleEffective; i++) {
			produits[i].afficher();
			System.out.println();
		}
	}
	
	public void suppression(ProduitInformatique produit) {
		for(int i=0; i<tailleEffective; i++) {
			if(produits[i] == produit) {
				for(int j=i; j<tailleEffective-1; j++)
					produits[i] = produits[i+1];
				tailleEffective--;
				return;
			}
		}
	}
}
