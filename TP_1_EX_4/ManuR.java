public class ManuR extends Manu implements Risque {
    String nom , prenom , date ;
    int age , nbreH ;


    public ManuR (String nom , String prenom , int age , String date , int nbreH){
        super(nom , prenom , age ,date , nbreH ) ;

        this.nom = nom ;
        this.prenom = prenom ;
        this.age = age ;
        this.date = date ;
        this.nbreH = nbreH ;

    }

    public float calculerSalaire() {
        float sal = super.calculerSalaire() + Risque.prime ;
        return sal ;
    }
    public String getNom (){

        return this.nom + this.prenom ;
    }


}