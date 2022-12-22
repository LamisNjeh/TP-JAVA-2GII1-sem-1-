public class Manu extends Employe implements Risque {
    int nbreH ;
    String nom , prenom  , date ;
    int age ;


    public Manu (String nom , String prenom , int age , String date , int  nbreH) {
        super(nom, prenom, age, date);
        this.nbreH = nbreH;
        this.nom = nom ;
        this.prenom = prenom ;
        this.age =age  ;
        this.date = date ;
    }



    float calculerSalaire() {
        float sal = (float) (this.nbreH * 65.0);
        return sal ;
    }
    public String getNom (){
        return this.nom + this.prenom ;
    }


}

