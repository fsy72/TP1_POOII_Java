package fichiers;

public class Teste {

	public static void main(String[] args) {

		// Creation de divers courriers/colis...
		Lettre lettre1 = new Lettre(200, true, "Chemin des Acacias 28, 1009 Pully", "A3");
		Lettre lettre2 = new Lettre(800, false, "", "A4");
		
		Publicite pub1 = new Publicite(1500, true,"Les Moilles 13A, 1913 Saillon");
		Publicite pub2 = new Publicite(3000, false,"");
		
		Colis colis1 = new Colis(5000, true, "Grand rue 18, 1950 Sion", 30);
		Colis colis2 = new Colis(3000, false, "Chemin des fleurs 48, 2800 Delemont", 70);
		
		// Afrranchissement des courriers individuels
		System.out.println("Lettre 1 - Prix: " + lettre1.affranchir());
		lettre1.affiche();
		System.out.println();
		
		System.out.println("Lettre 2 - Prix: " + lettre2.affranchir());
		lettre2.affiche();
		System.out.println();
		
		System.out.println("Publicite 1 - Prix: " + pub1.affranchir());
		pub1.affiche();
		System.out.println();
		
		System.out.println("Publicite 2 - Prix: " + pub2.affranchir());
		pub2.affiche();
		System.out.println();
		
		System.out.println("Colis 1 - Prix: " + colis1.affranchir());
		colis1.affiche();
		System.out.println();
		
		System.out.println("Colis 2 - Prix: " + colis2.affranchir());
		colis2.affiche();
		System.out.println();
	}

}
