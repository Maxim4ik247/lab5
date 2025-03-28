package resources;

public class Coordinates {
    private Float x; //Максимальное значение поля: 769, Поле не может быть null
    private float y; //Максимальное значение поля: 682

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String toXml() {
        return "<Coordinates>" + "\n\t\t<x>" + x + "</x>" + "\n\t\t<y>" + y + "</y>" + "\n\t" + "</Coordinates>";
    }

    @Override
    public String toString() {
        return "Coordinates{" + "x=" + x + ", y=" + y + '}';
    }
}
