import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>() ;
        ArrayList<Animal>criyant = new ArrayList<>();
        ArrayList<Animal> mute = new ArrayList<>() ;


        Chat michou= new Chat() ;
        animals.add(michou) ;

        Chien milou = new Chien() ;
        animals.add(milou) ;
        Lapin moumou = new Lapin() ;
        animals.add(moumou) ;
        for (int i= 0 ; i<animals.size() ; i++){
            if(animals.get(i).isCrie()==true){
                criyant.add((animals.get(i))) ;
            }
            else {
                mute.add((animals.get(i))) ;
            }
            System.out.println(" Les animaux sont : " +animals) ;
            System.out.println( "Les animaux criyants sont : "+criyant) ;
            System.out.println("Les animaux muets sont "+mute) ;

        }






    }
}