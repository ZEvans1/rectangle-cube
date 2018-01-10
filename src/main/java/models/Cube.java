package models;


public class Cube {
    private Rectangle face;

    public Cube(Rectangle rectangle) {
        face = rectangle;
    }

    public Rectangle getFace() {
        return face;
    }

    public int volume() {
        int height = face.getHeight();
        return height*height*height;
    }

    public int getSurfaceArea() {
        return face.area() * 6;
    }
}
