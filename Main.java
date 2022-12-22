public class Main {
    public static void main(String[] args) {
        Forme[] figures= new Forme[3] ;
        figures[0] = new Carre(2) ; // creer un carrée de 2 cm de coté
        figures[1] = new Cercle(3) ;// creer un cercle de 3cm de rayon
        figures[2]= new Carre(5.2); // creer un carre de 5.2 cm de cote
        for (int i=0 ; i<figures.length ; i++){
            System.out.println(figures[i] +" :figures  : " +figures[i].getSurfaces()+" cm2" ) ;
        }

    }
}