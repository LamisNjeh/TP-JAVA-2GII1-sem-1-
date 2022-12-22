public class TechR extends Tech implements Risque  {
    String nom , prenom , date ;
    int age , nbreUnite ;
    public TechR (String nom ,String prenom , int age , String date , int nbreUnite) {
        super(nom , prenom , age , date , nbreUnite) ;
        this.nom = nom ;
        this.prenom = prenom ;
        this.age =age ;
        this.date = date  ;
        this.nbreUnite = nbreUnite ;


    }
    public float calculerSalaire () {
        float sal = super.calculerSalaire() + Risque.prime ;
        return sal  ;
    }


}

