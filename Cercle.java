public class Cercle extends Forme{
    double r=0.0 ;

    public Cercle(double r) {
        this.r = r ;

    }
    public double getSurfaces(){
        double  pi = 3.1415926535897928 ;
        double s = pi* this.r *this.r ;
        return s ;

    }
    public double perimetre() {
        double pi = 3.1415926535897928 ;
        double p = 2*this.r* pi ;
        return p ;
    }

}
