
public class Ellipse extends Figure implements Areaable {
    public Ellipse(Point2D p1 , Point2D p2){
        super(p1, p2);
    }
    public Ellipse(){}
    public double getArea(){
        return Math.PI*getHeight()*getWidth()/4.0;

    }
    public double getContour(){
        return 2.0 * (Math.PI*getWidth()*getHeight()+(getWidth()-getHeight())*(getWidth()-getHeight()))/(getWidth()+getHeight());
    }
    public void draw(){
        System.out.println(" Ellipse : ");
    }

}
