package fichiers;

class Entier extends Nombre {
	int val;
	Entier(int n) {val = n;}
	Nombre plus(Nombre n) {
		System.out.println("plus d’Entier");
		return null;
	}
}