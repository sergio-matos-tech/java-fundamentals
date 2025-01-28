package ex03;

public class Rectangle {
    private double width;
    private double height;


    public Rectangle() {
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(double height, double width) {
        if (height > 0 && width > 0) {
            this.height = height;
            this.width = width;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return (this.width * this.height);
    }

    public double perimeter() {
        return 2 * (this.height + this.width);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width = " + width +
                ", height = " + height +
                ", perimeter = " + perimeter() +
                ", diagonal = " + diagonal() +
                ", area = " + area() +
                '}';
    }
}
