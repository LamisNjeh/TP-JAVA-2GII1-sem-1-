public  abstract class Comm extends Employe {
    float chiffAff ;
    String nom , prenom ,  date ;
    int age ;
    public Comm( String nom , String prenom , int age , String date,float chiffAff) {
        super(nom ,prenom ,age ,date) ;
        this.age = age ;
        this.nom = nom ;
        this.prenom = prenom ;
        this.date = date ;
        this.chiffAff= chiffAff ;
    }



    }
