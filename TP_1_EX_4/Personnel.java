import java.util.* ;
import java.lang.* ;

public class Personnel {
    ArrayList<Employe>  emp = new ArrayList<Employe>() ;
    public Personnel(ArrayList<Employe> emp ) {
        this.emp = emp;
    }

    public Personnel() {}

    public void ajouterEmploye(Employe e) {
          emp.add(e);

    }
     void afficherSalaires() {
        for( int i=0 ; i < emp.size() ; i++){
            System.out.println("le salaire de "+emp.get(i).getNom()+" est : "+emp.get(i).calculerSalaire())  ;
        }

     }


    double salaireMoyen(){
        double sal , salMoy;
        sal =0.0 ;
        for (int i=0 ; i< emp.size() ; i++) {
            sal=sal +  emp.get(i).calculerSalaire();




        }
        salMoy = sal /emp.size() ;
        return salMoy ;
    }



}

