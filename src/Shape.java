public abstract class Shape {

    public String color = "red";
    public Boolean filled = true;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        color = color;
    }
    public Boolean getFilled() {
        return filled;
    }
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    Shape(String color, Boolean filled){
        this.setColor(color);
        this.setFilled(filled);
    }
    public abstract  double getArea();
    public abstract  double getPerimeter();
    public String toString (){
        return String.format("%d %d",getColor(), getFilled());
    }

}
