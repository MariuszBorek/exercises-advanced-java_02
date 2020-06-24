package org.oopexercises.zad_3;

public abstract class Shape {
    private String color;
    private boolean isFilled;

    public Shape() {
        color = "unknow";
        isFilled = false;
    }

    public Shape (String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape with color of " +
                color +
                " and " +
                isFilled;
    }
}
