package fichiers;

public class Test {

	public static void afficherTabPoints (Point[] tabPoints){
		for (int i = 0; i < tabPoints.length ; i++)
			System.out.println(tabPoints[i] + ",");
	}
	public static void trouverBornes (Point borneInf, Point borneSup, Point[] tabPoints){
		for (int i = 0; i < tabPoints.length ; i++){
			if (borneInf.x > tabPoints[i].x) borneInf = tabPoints[i];
			if (borneSup.x < tabPoints[i].x) borneSup = tabPoints[i];
		}
	}
	public static void main(String[] args) {
		Point borneInf = new Point (0, 0); Point borneSup = new Point (0, 0);
		Point[] tabPoints = new Point[4];
		tabPoints[0] = new Point (100, 100); tabPoints[1] = new Point (10, 10);
		tabPoints[2] = new Point (150, 150); tabPoints[3] = new Point (-5, -5);
		afficherTabPoints (tabPoints);
		trouverBornes (borneInf, borneSup, tabPoints);
		System.out.println("Borne Inf:" + borneInf + "; Borne Sup: " + borneSup);
	}

}
