package home.learn.lyceum.Chek;
import java.util.Random;
/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class Piece {
    public char Simmbol = 'K';
    public String color = "white";
    Axis axis = new Axis();
    public String [] attaka = new String[9];

    public int[] getAxisXY() {
        return axis.getAxisXY();
    }
    public int getAxisX() {
        return axis.getAxisX();
    }
    public int getAxisY() {
        return axis.getAxisY();
    }
    private int rnd() {
        return new Random().nextInt(8);
    }
    private int rnd(int i) {
        return new Random().nextInt(i);
    }
    public void setAxisXY(int axisX, int axisY) {
        axis.setAxisXY(axisX, axisY);
    }
    private void setColor(String color) {
        if (color == "white" || color == "black") {  //если цвет не совпадает по Белый!
            this.color = color;
        } else {
            this.color = "white";
        }
    }
    public Piece(int axisX, int axisY, String color) {
        axis.setAxisXY(axisX, axisY);
        setColor(color);

    }
    public Piece() {
        axis.setAxisX(rnd());
        axis.setAxisY(rnd());
    }
    public Piece(String color, char Simmbol) {
        axis.setAxisX(rnd());
        axis.setAxisY(rnd());
        this.color = color;
        this.Simmbol = Simmbol;
    }
    public Piece(int axisX, int axisY) {
        axis.setAxisX(axisX);
        axis.setAxisY(axisY);
        this.color = "white";
    }

    public char getSimbol(int axisX, int axisY) {
        return Simmbol;
    }
}