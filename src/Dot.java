import java.awt.*;

public class Dot {

    private Point center;
    private int radius;
    private Color color;


    public Dot(Point center) {
        this.center = center;
        radius = 25;
        color = Color.BLUE;
    }

    public int getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX(){
        return (int) center.getX();
    }
    public int getY(){
        return (int) center.getY();
    }
}
