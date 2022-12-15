package pt.up.fe.ldts.example2;

public class Rectangle extends Shape{
    private double height;
    private double width;
    public Rectangle(double x, double y, double width, double height){
        super(x,y);
        this.height=height;
        this.width=width;
    }
    @Override
    public double getArea() {
        return height * width;
    }
    @Override
    public double getPerimeter() {
        return (height + width)*2;
    }
    @Override
    public void draw(GraphicFramework graphicFramework) {
        graphicFramework.drawLine(getX(), getY(), getX() + width, getY());
        graphicFramework.drawLine(getX() + width, getY(), getX() + width, getY() + height);
        graphicFramework.drawLine(getX() + width, getY() + height, getX(), getY() + height);
        graphicFramework.drawLine(getX(), getY() + height, getX(), getY());
    }
}
