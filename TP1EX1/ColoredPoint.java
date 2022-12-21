
public class ColoredPoint extends Point{

    private byte color  ;

    public ColoredPoint(){
        color = (byte)(Math.random()*256) ;
    }
    public ColoredPoint( byte color){
        this.color = color ;

    }

    public void setColor(byte c) {
        this.color = c ;

    }
    public byte getColor() {
        return this.getColor() ;
    }
}




