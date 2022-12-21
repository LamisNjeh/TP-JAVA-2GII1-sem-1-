public class Point {
    private double x,y ;
    public Point(){
        x = Math.random()*100 ;
        y= Math.random()*100 ;
    }
    public Point(double x ,double y){
        this.x = x ;
        this.y= y ;
    }
    public void add (int dx , double dy){
        x = x+dx ;
        y= y+dy ;
    }
    public double getX(){return  x ; }
    public double getY(){
        return y ;
    }
}
