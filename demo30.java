import java.util.Scanner;

public class demo30 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Square s1 = new Square();
        Circle c1 = new Circle();
        Geometry gg = new Geometry();
        gg.calculate(r1);
        gg.calculate(s1);
        gg.calculate(c1);
    }
    
}
abstract class Shape{
    float area;
    abstract void input();
    abstract void compute();
    void display(){
        System.out.println("Area is " + area);
    }
    Scanner sc = new Scanner(System.in);
}
class Rectangle extends Shape{
    
    float length;
    float breadth;
    void input(){
        System.out.println("Enter length of rectangle");
        length = sc.nextFloat();
        System.out.println("Enter breadth of rectangle");
        breadth = sc.nextFloat();
    }
    void compute(){
        area = length * breadth;
    }
}
class Square extends Shape{
    float side;
    void input(){
        System.out.println("Enter length of side");
        side = sc.nextFloat();
    }
    void compute(){
        area = side * side;
    }
}
class Circle extends Shape{
    float radius;
    void input(){
        System.out.println("Enter length of the radius");
        radius = sc.nextFloat();
    }
    void compute(){
        area = 3.14f * radius * radius;
    }
}
class Geometry{
    void calculate(Shape s){
        s.input();
        s.compute();
        s.display();
    }
}
