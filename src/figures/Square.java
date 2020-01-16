package figures;

public class Square extends Figure implements Common {

    private long side;

    public long getSide() {
        return Math.round(Math.random());
    }

    @Override
    public long Area() {
        side = this.getSide();
        return side*side;
    }

    @Override
    public String toString() {
//        str = System.out.println("Квадрат. Длина стороны - " + side + ", площадь - " + Square());
        return "Квадрат. Длина стороны - " + side + ", площадь - " + Area();
    }
}
