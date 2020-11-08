package xyz.mjkblog.principle.OCP;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--12--3:03 PM
 */
public class OCP2 {
    public static void main(String[] args) {
        GraphicEditor2 graphicEditor2 = new GraphicEditor2();
        graphicEditor2.drawShape(new Circle2());
        graphicEditor2.drawShape(new Rectangle2());
    }
}

abstract class Shape2{
    int m_type;
    public abstract void draw();
}

class GraphicEditor2 {
    public void drawShape(Shape2 s) {
        s.draw();
    }
}


class Rectangle2 extends Shape2 {
    Rectangle2() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle...");
    }
}

class Circle2 extends Shape2 {
    Circle2() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("Circle...");
    }
}