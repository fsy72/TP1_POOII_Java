package fichiers;

class Reel extends Entier {
	int denom;
	Reel(int n, int n2) {
		super(n);
		denom=n2;
	}
	Reel plus(Reel n) {
		System.out.println("plus de Reel" );
		return new Reel(9, 9);
	}
}
