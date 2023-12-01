public class Etudiant {
    public int identifiant;
    public String nom;
    public String prenom;
    public float moyenne;

    public Etudiant(int identifiant, String nom, String prenom, float moyenne) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }
    //2
    public boolean equals(Object obj) {
        if (obj instanceof Etudiant) {
            Etudiant etudiant = (Etudiant) obj;
            return this.identifiant == etudiant.identifiant;
        }
        return false;
    }
    public String toString() {
        return "Etudiant " + this.identifiant + " : " + this.nom + " " + this.prenom + " (" + this.moyenne + ")";
    }


    public void ajouterUneAbsence() {
        System.out.println("Absence ajoutée");
    }
}