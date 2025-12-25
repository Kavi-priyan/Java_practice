package May26Shape;
//Circle.java
public class Circle extends Shape {
 private int radius;

 public Circle(int radius) {
     this.radius = radius;
 }

 public void CalculateArea() {
     setArea((int)(3.14 * radius * radius));
     System.out.println("Circle area: " + getArea());
 }
}
