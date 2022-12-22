public class Representant extends Comm {
    String nom,  prenom, date;
    int age;
    float chiffAff ;
    public Representant(String nom, String prenom, int age ,String date,  float chiffAff) {
        super(nom, prenom, age , date , (float) chiffAff);
        this.nom=nom ;
        this.prenom = prenom ;
        this.age =age  ;
        this.date = date ;
        this.chiffAff = chiffAff ;

    }


    @Override

    float  calculerSalaire() {
        float sal = (float) (800+0.2*super.chiffAff) ;
        return sal ;
    }


    @Override
    public String getNom() {
        // TODO Auto-generated method stub
        return this.nom + this.prenom;
    }

}

