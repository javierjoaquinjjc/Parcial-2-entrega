public class Rectangulo extends Shape{
    public double width;
    public double length;
    private double area;
    private double Perimeter;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return Perimeter;
    }

    public void setPerimeter(double perimeter) {
        Perimeter = perimeter;
    }

    Rectangulo(double width,double length){
        super();
        this.setWidth(width);
        this.setLength(length);

    }

    public String toString (){
        return String.format("%d %s ",getColor(), getFilled(),"%a %x ",getWidth(),getLength());
    }

    Rectangulo(double width, double length,double area, double perimetro){
        super();
        this.setWidth(width);
        this.setLength(length);
        this.setArea(area);
        this.setPerimeter(perimetro);
    }

}
