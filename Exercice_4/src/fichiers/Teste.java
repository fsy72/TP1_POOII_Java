package fichiers;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrajetSimple trajet1 = new TrajetSimple("Affaire", "Paris", "Lyon", 120);
		TrajetSimple trajet2 = new TrajetSimple("Loisir", "Lyon", "Marseille", 90);

		TrajetCompose voyageComplet = new TrajetCompose(5);
		voyageComplet.ajoute(trajet1);
		voyageComplet.ajoute(trajet2);

		System.out.println(voyageComplet.dureeCumulee());
		System.out.println(voyageComplet.ListeLieu());
	}

}
