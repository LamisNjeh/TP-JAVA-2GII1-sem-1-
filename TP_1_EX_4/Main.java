


public class Main {
    public static void main(String[] args) {
        Personnel p = new Personnel() ;
        p.ajouterEmploye(new Vendeur("Pierre " ," Business" , 45 , "1995" ,30000));
        p.ajouterEmploye(new Representant("Leon " ,"Vendout" , 25 , "2001" ,20000));
        p.ajouterEmploye(new Tech("Yven " ," Bosseeur" , 28 , "1998" ,1000));
        p.ajouterEmploye(new Manu("Jeanne " ," Stocketout" , 32, "1998" ,45));
        p.ajouterEmploye(new TechR("Jean " ," Fillipe" , 28  , "2000" ,1000));
        p.ajouterEmploye(new ManuR("Al " ,"Abordage" , 30 , "2001" ,45));

        p.afficherSalaires();
        System.out.println("Le salaire moyen de l Entreprise est " + p.salaireMoyen());









    }
}