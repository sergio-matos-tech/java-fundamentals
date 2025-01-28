package ex01;

public class Triangle {
    public double l1;
    public double l2;
    public double l3;

    public Triangle() {}

    public Triangle(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "l1 = " + l1 +
                ", l2 = " + l2 +
                ", l3 = " + l3 +
                '}';
    }

    public double area() {
        double semiPerimeter = (this.l1 + this.l2 + this.l3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - this.l1) * (semiPerimeter - this.l2)
                * (semiPerimeter - this.l3));
    }
}
