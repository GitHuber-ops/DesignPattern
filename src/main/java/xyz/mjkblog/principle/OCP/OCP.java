package xyz.mjkblog.principle.OCP;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--12--2:44 PM
 */
public class OCP {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawCircle(new Circle());
        graphicEditor.drawRectangle(new Rectangle());
    }
}


class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("Rectangle...");
    }

    public void drawCircle(Shape r) {
        System.out.println("Circle...");
    }
}


class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}