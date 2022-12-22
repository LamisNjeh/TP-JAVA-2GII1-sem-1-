import java.awt.*;

public class Rectangle extends Forme{
    double  x=0.0 ;
    double  y=0.0 ;

    public Rectangle(double x, double y ){
        this.x = x;
        this.y = y ;

    }
    public Point getCentre(){
       int a =(int) this.x/2 ;

        int b=(int) this.y/2 ;
        Point p = new Point(a,b) ;
        return p ;

    }
    public double getSurfaces(){
        double s = this.x * this.y ;
        return s ;
    }

}
