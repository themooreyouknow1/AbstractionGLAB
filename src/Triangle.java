public class Triangle extends Shape {

    public Triangle(){}


    public Triangle(String color) {
        super.color = color;
    }
    public void setBase(int base) {
        this.base = base;
    }
    @Override
    public double getArea() {
        return 0.5*super.base * super.height;
    }

    @Override
    public void displayshapName() {
        System.out.println("I am a TriAngle"  );
    }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Triangle[base=" + super.base + ",height=" + super.height + "," + super.toString() + "]";
    }
}
