public class Vendeur extends Comm {
    String nom ,prenom , date ;
    int age ;
    float chiffAff ;
    public Vendeur(String nom , String prenom ,  int age  , String date , float chiffAff){
        super(nom ,prenom , age  , date ,  chiffAff) ;
        this.nom = nom ;
        this.prenom = prenom ;
        this.age = age ;
        this.date = date ;
        this.chiffAff=chiffAff ;

    }
    public float calculerSalaire () {
        float sal = (float) (this.chiffAff *0.2 + 400);
        return sal ;

    }


}