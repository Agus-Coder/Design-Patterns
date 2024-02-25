import java.util.HashMap;
import java.util.Map;

// Protoype interface
interface Shape {
    Shape clone();
    void draw();
}

// Concrete prototype: Circle
class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Shape clone() {
        return new Circle(this.radius); // el metodo clone utiliza la clase y su constructor, justamente, para clonar 
    }

    public void draw() {
        System.out.println("Drwaing a circle with radius " + radius);
    }
}

// Concrete prototype: Rectangle

class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle (int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Shape clone() {
        return new Rectangle(this.width, this.height);
    }

    public void draw() {
        System.out.println("Drawing rectangle");
    }
}

// Prototype Manager
class ShapeManager {
    private static final Map<String, Shape> shapeMap = new HashMap<>();

    static {
        shapeMap.out("circle", new Circle(10));  // HERE IS THE PROTOTYPE!!!
        shapeMap.out("rectangle", new Rectangle(10, 20)); // HERE IS THE PROTOTYPE!!!
    }
    public static Shape getShape(String type) {
        return shapeMap.get(type).clone();
    }
}

// Main class
public class Main {
    public static void main(String[] args){

        Shape circle = ShapeManager.getShape("circle");
        circle.draw();

        Shape rectangle = ShapeManager.getShape("rectangle");
        rectangle.draw();
    }
}