public abstract  class Employe {
    String nom;
    String prenom;
    String date;
    int age;

    public Employe(String nom, String prenom, int age, String date) {
        this.age = age;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
    }

     abstract  float calculerSalaire();

    public String getNom() {
        return this.nom + this.prenom;
    }
}

