package com.moriaty.principle.ocp;

/**
 * <p>
 * 开闭原则
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/24 21:21
 */
public class Ocp {
    public static void main(String[] args) {
        // 使用, 看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3) {
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shape s) {
        System.out.println("绘制矩形");
    }

    public void drawCircle(Shape s) {
        System.out.println("绘制圆形");
    }

    public void drawTriangle(Shape s) {
        System.out.println("绘制三角形");
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

// 新增绘制三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}

