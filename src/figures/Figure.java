package figures;
import java.util.Random;

abstract class Figure {

    protected String name;
    private String color;
//    private Enum color{
//        BLUE,
//        GREEN;
//    }

    protected double area;

    public Boolean Drow() {
        return Math.random() < 0.5;
    }

    public String GetColor() {
        return this.color;
    }

    public void SetColor(String color) {
        this.color = color;
    }
}
