import java.awt.*;

public class Carre extends Forme{
    private double cote =0.0 ;




    public Carre(double cote) {
        this.cote = cote ;
    }
    public Point getCentre() {
        int x = (int) (cote/2);
        Point p = new Point( x ,  x) ;
        return  p ;
    }
    public double perimetre() {
        double p = this.cote *4 ;
        return p ;

    }
    public double getSurfaces(){
        double s = this.cote*this.cote ;
        return s ;
    }





    }


