public class Tech extends Employe   {

    int nbreUnite , age  ;
    String nom , prenom , date ;



    public Tech ( String nom ,String prenom , int age , String date , int nbreUnite ) {
        super (nom , prenom , age , date) ;
        this.nbreUnite= nbreUnite ;
        this.age =age  ;
        this.date = date ;
        this.prenom=prenom ;
        this.nom = nom ;

    }
    public float  calculerSalaire() {
        float sal = (float) (nbreUnite * 5.0);
        return sal ;
    }


    public String getNom () {
        return this.nom + this.prenom;
    }

}
