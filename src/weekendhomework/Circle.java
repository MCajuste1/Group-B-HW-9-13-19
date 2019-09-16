package weekendhomework;

public class Circle {
    public int radius;
    public double pi;


    public Circle(int radius, double pi){
        this.radius = radius;
        this.pi = pi;

    }

    public void calculateArea() {
        System.out.println(pi *(radius * radius));


    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}

