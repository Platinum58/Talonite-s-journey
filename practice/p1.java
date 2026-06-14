abstract class shape{
    String name;
    shape(String name){
        this.name = name;
    }
    void displayInfo(){
        System.out.println(name);
    }
    abstract void area();
}
interface drawable{
    void draw();
    
}
class circle extends shape implements drawable{
    int radius;
    circle(String name, int r){
        super(name);
        this.radius = r;
    }
    void area(){
        System.out.println(3.14*2*radius);
    }
    public void draw(){
        System.out.println("now drawing a circle");
    }
}
class Rectangle extends shape implements drawable{
    int length;
    int breadth;
    Rectangle(String name, int l,int b){
        super(name);
        this.length = l;
        this.breadth = b;
    }
    void area(){
        System.out.println(length*breadth);
    }
    public void draw(){
        System.out.println("now drawing a rectangle");
    }
}
public class p1{
    public static void main(String[]args){
        circle c = new circle("circle",2);
        Rectangle r = new Rectangle("rectangle",3,4);
        c.displayInfo();
        c.draw();
        c.area();
        r.displayInfo();
        r.draw();
        r.area();
    }
}