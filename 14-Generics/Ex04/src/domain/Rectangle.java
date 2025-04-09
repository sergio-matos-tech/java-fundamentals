package domain;

public class Rectangle implements Shape {
    private Double width;
    private Double height;


    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return getHeight() * getWidth();
    }
}
