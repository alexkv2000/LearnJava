package home.learn.lyceum.Chek;
/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class Axis {
    public int axisX;
    public int axisY;
    public void setAxisX(int axisX) {
        this.axisX = axisX;
    }
    public void setAxisY(int axisY) {
        this.axisY = axisY;
    }
    public void setAxisXY(int axisX, int axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }
    public int[] getAxisXY() {
        int[] el = new int[2];
        el[0] = axisX;
        el[1] = axisY;
        return el;
    }
    public int getAxisX() {
        return axisX;
    }
    public int getAxisY() {
        return axisY;
    }
}