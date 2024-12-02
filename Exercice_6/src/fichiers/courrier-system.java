/**
 * Package de gestion des courriers.
 * 
 * Ce package fournit un système complet de gestion et d'affranchissement 
 * de différents types de courriers.
 *
 * @author [Nom de l'auteur]
 * @version 1.0
 * @since [Date]
 * @see fichiers.Courrier
 * @see fichiers.Lettre
 * @see fichiers.Colis
 * @see fichiers.Publicite
 */
package fichiers;

/**
 * Classe abstraite représentant un courrier générique.
 * 
 * Cette classe définit les propriétés et comportements de base 
 * pour tous les types de courriers, tels que le poids, 
 * le mode d'expédition et l'adresse de destination.
 * 
 * Les sous-classes doivent implémenter la méthode {@code affranchir()}
 * pour calculer le prix spécifique de chaque type de courrier.
 * 
 * @author [Nom de l'auteur]
 * @version 1.0
 * @since [Date]
 */
public abstract class Courrier {
    
    /**
     * Poids du courrier en grammes.
     */
    private double poids;
    
    /**
     * Mode d'expédition du courrier.
     * 
     * @see #mode
     * <ul>
     *   <li>{@code true} : Mode Express</li>
     *   <li>{@code false} : Mode Normal</li>
     * </ul>
     */
    private boolean mode;
    
    /**
     * Adresse de destination du courrier.
     */
    private String adresseDestination;
    
    /**
     * Constructeur pour créer un nouveau courrier.
     *
     * @param poids Poids du courrier en grammes
     * @param mode Mode d'expédition (express ou normal)
     * @param adresseDestination Adresse complète de destination
     */
    public Courrier(double poids, boolean mode, String adresseDestination) {
        this.poids = poids;
        this.mode = mode;
        this.adresseDestination = adresseDestination;
    }
    
    /**
     * Calcule le montant de l'affranchissement.
     * 
     * Cette méthode abstraite doit être implémentée par chaque 
     * sous-classe pour calculer le prix spécifique.
     *
     * @return Montant de l'affranchissement
     */
    public abstract double affranchir();
    
    /**
     * Affiche les détails du courrier.
     * 
     * Cette méthode affiche :
     * <ul>
     *   <li>Le poids</li>
     *   <li>Le mode d'expédition</li>
     *   <li>L'adresse de destination</li>
     *   <li>La validité du courrier</li>
     * </ul>
     */
    public void affiche() {
        System.out.println("Poids: " + poids + " Gramme");
        System.out.println("Mode d'expédition: " + (mode ? "express":"normal"));
        System.out.println("Adresse de destination: " + adresseDestination);
        if(adresseDestination.isEmpty())
            System.out.println("Courrier invalide");
        else
            System.out.println("Courrier valide");
    }
    
    /**
     * Retourne le poids du courrier.
     *
     * @return Poids du courrier en grammes
     */
    public double getPoids() {
        return poids;
    }
    
    /**
     * Vérifie le mode d'expédition du courrier.
     *
     * @return {@code true} si le mode est express, {@code false} si normal
     */
    public boolean isMode() {
        return mode;
    }
}

/**
 * Classe représentant une lettre.
 * 
 * Hérite de la classe abstraite {@link Courrier} et ajoute 
 * une spécificité de format (A4 ou A3).
 * 
 * @author [Nom de l'auteur]
 * @version 1.0
 * @since [Date]
 * @see Courrier
 */
public class Lettre extends Courrier {
    
    /**
     * Format de la lettre.
     * 
     * Valeurs possibles :
     * <ul>
     *   <li>"A4"</li>
     *   <li>"A3"</li>
     * </ul>
     */
    private String format;
    
    /**
     * Constructeur pour créer une nouvelle lettre.
     *
     * @param poids Poids de la lettre en grammes
     * @param mode Mode d'expédition (express ou normal)
     * @param adresseDestination Adresse complète de destination
     * @param format Format de la lettre (A4 ou A3)
     */
    public Lettre(double poids, boolean mode, String adresseDestination, String format) {
        super(poids, mode, adresseDestination);
        this.format = format;
    }
    
    /**
     * Calcule le montant de l'affranchissement pour la lettre.
     * 
     * Calcul basé sur :
     * <ul>
     *   <li>Format : 2.50€ (A4), 3.50€ (A3)</li>
     *   <li>Poids : Supplément linéaire</li>
     *   <li>Mode : Multiplicateur de 2 pour express</li>
     * </ul>
     *
     * @return Montant de l'affranchissement
     */
    public double affranchir() {
        double aff = (format=="A4" ? 2.50:3.50) + 1.0*super.getPoids();
        if(!super.isMode())
            return aff;
        return 2*aff;
    }
    
    /**
     * Affiche les détails de la lettre.
     * 
     * Ajoute le format aux informations du courrier parent.
     */
    public void affiche() {
        super.affiche();
        System.out.println("Format: " + format);
    }
}

/**
 * Classe représentant un colis.
 * 
 * Hérite de la classe abstraite {@link Courrier} et ajoute 
 * une spécificité de volume.
 * 
 * @author [Nom de l'auteur]
 * @version 1.0
 * @since [Date]
 * @see Courrier
 */
public class Colis extends Courrier {
    
    /**
     * Volume du colis en litres.
     */
    private double volume;
    
    /**
     * Constructeur pour créer un nouveau colis.
     *
     * @param poids Poids du colis en grammes
     * @param mode Mode d'expédition (express ou normal)
     * @param adresseDestination Adresse complète de destination
     * @param volume Volume du colis en litres
     */
    public Colis(double poids, boolean mode, String adresseDestination, double volume) {
        super(poids, mode, adresseDestination);
        this.volume = volume;
    }
    
    /**
     * Calcule le montant de l'affranchissement pour le colis.
     * 
     * Calcul basé sur :
     * <ul>
     *   <li>Volume : 0.25€ par litre</li>
     *   <li>Poids : Supplément linéaire</li>
     *   <li>Mode : Multiplicateur de 2 pour express</li>
     * </ul>
     *
     * @return Montant de l'affranchissement
     */
    public double affranchir() {
        double aff = 0.25*volume + 1.0*super.getPoids();
        if(!super.isMode())
            return aff;
        return 2*aff;
    }
    
    /**
     * Affiche les détails du colis.
     * 
     * Ajoute le volume aux informations du courrier parent.
     */
    public void affiche() {
        super.affiche();
        System.out.println("Volume: " + volume + " litres");
    }
}

/**
 * Classe représentant un courrier publicitaire.
 * 
 * Hérite de la classe abstraite {@link Courrier} sans 
 * ajouter de propriétés supplémentaires.
 * 
 * @author [Nom de l'auteur]
 * @version 1.0
 * @since [Date]
 * @see Courrier
 */
public class Publicite extends Courrier {
    
    /**
     * Constructeur pour créer un nouveau courrier publicitaire.
     *
     * @param poids Poids du courrier publicitaire en grammes
     * @param mode Mode d'expédition (express ou normal)
     * @param adresseDestination Adresse complète de destination
     */
    public Publicite(double poids, boolean mode, String adresseDestination) {
        super(poids, mode, adresseDestination);
    }
    
    /**
     * Calcule le montant de l'affranchissement pour le courrier publicitaire.
     * 
     * Calcul basé sur :
     * <ul>
     *   <li>Poids : 5€ par gramme</li>
     *   <li>Mode : Multiplicateur de 2 pour express</li>
     * </ul>
     *
     * @return Montant de l'affranchissement
     */
    public double affranchir() {
        double aff = 5.0*super.getPoids();
        if(!super.isMode())
            return aff;
        return 2*aff;
    }
    
    /**
     * Affiche les détails du courrier publicitaire.
     * 
     * Utilise l'implémentation du parent sans modification.
     */
    public void affiche() {
        super.affiche();
    }
}
