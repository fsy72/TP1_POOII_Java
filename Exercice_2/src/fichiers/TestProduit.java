package fichiers;

public class TestProduit {
    public static void main(String[] args) {
        ListeProduit listeProduits = new ListeProduit(10);

        OrdinateurBureau pc1 = new OrdinateurBureau("REF001", "Asus", new Date(1,1,2003), 699, "Intel i5", 8, 1000, "Nvidia GeForce GTX 1650", "Carte graphique");
        OrdinateurPortable portable1 = new OrdinateurPortable("REF002", "Dell", new Date(15,6,2021), 999, "AMD Ryzen 5", 16, 500, "Windows 10", "5 pouces", 15.6);

        Imprimante imp = new Imprimante("REF003", "HP", new Date(24,11,2017), 100, "IM pro", 50, 1);
        Scanners scan = new Scanners("RE004", "HP", new Date(8,9,2021), 88, 60, 500);
        
        listeProduits.ajout(pc1);
        listeProduits.ajout(portable1);
        listeProduits.ajout(imp);
        listeProduits.ajout(scan);

        System.out.println("<-----[Affichage liste]----->");
        listeProduits.affiche();

        listeProduits.suppression(pc1);
        System.out.println("<-----[Affichage liste]----->");
        listeProduits.affiche();
    }
}
