package org.example;

public class Color {
    private String name;
    private int R;
    private int G;
    private int B;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getR() {
        return R;
    }

    public void setR( int r) {
        R = r;
    }

    public  int getG() {
        return G;
    }

    public void setG( int g) {
        G = g;
    }

    public  int getB() {
        return B;
    }

    public void setB( int b) {
        B = b;
    }

    public Color(String name,  int r,  int g, int b) {
        this.name = name;
        R = r;
        G = g;
        B = b;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", R='" + R + '\'' +
                ", G='" + G + '\'' +
                ", B='" + B + '\'' +
                '}';
    }
}
