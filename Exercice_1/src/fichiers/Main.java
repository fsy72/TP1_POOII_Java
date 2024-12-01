package fichiers;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// vérification des méthodes et affichage des informations saisies
		System.out.print("Entrez votre Nom: ");
		String nom = sc.nextLine();

		System.out.print("Entrez votre taillle: ");
		double taille = sc.nextDouble();
		
		System.out.print("Entrez votre age: ");
		int age = sc.nextInt();

		System.out.println("Taille: " + taille);
		System.out.println("Nom: " + nom);
		System.out.println("Age: " + age + " ans");
		
		// exemple de saisi d'une caractère
		System.out.print("Entrez un caractere: ");
		char c = sc.next().charAt(0);
		System.out.println("Caractere saisi: " + c);
		
		sc.close();
		
		// ===================================
		String s = JOptionPane.showInputDialog("Entrez un chaîne");
		// affichage de s
		JOptionPane.showMessageDialog(null, s, "Affichage de la chaîne s", JOptionPane.INFORMATION_MESSAGE);
		
		// saisi entiers
		int[] tab = new int[5];
		for(int i=0; i<5; i++) {
			String entier = JOptionPane.showInputDialog("Entrez la entier " + (i+1));
            if (entier == null) {
                JOptionPane.showMessageDialog(
					null, 
					"Saisie annulée", 
					"Annulation", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            try {
                int nombre = Integer.parseInt(entier);
                tab[i] = nombre;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
					null, 
					"Erreur : Vous devez saisir un nombre entier !", 
					"Erreur de saisie", JOptionPane.ERROR_MESSAGE);
                i--;
            }
		}
		/*StringBuilder sb = new StringBuilder();
		for(int i=0; i<5; i++) {
			sb.append(tab[i]);
		}
		JOptionPane.showMessageDialog(null, 
			sb.toString(), 
			"Affichage du tableau tab", JOptionPane.INFORMATION_MESSAGE);*/
		JOptionPane.showMessageDialog(
			null, Arrays.toString(tab), 
			"Affichage du tableau tab", JOptionPane.INFORMATION_MESSAGE);
		System.out.println();
		
		
		// ===================================
		int val = 40;
		System.out.printf("la valeur est %d\n", val);
		System.out.printf("Le %2$s %1$s", "Java", "langage");

	}

}
