public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;
    
    // Constructor with radius
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Getter for radius
    public double getRadius() {
        return radius;
    }
    
    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Override getArea from GeometricObject
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    // Override getPerimeter from GeometricObject
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    // Override compareTo from Comparable
    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }
    
    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }
    
    // Override hashCode method
    @Override
    public int hashCode() {
        return Double.hashCode(radius);
    }
    
    // toString method
    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}
