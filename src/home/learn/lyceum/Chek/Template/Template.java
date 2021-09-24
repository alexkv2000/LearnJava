package home.learn.lyceum.Chek.Template;

import home.learn.lyceum.Chek.Piece;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class Template {
    public char[][] temp = new char[9][9];
    public char type = ' ';


    public void addTemplate(Piece piece, char ch) {
        if (ch == 'V' || ch == 'G' || ch == 'D') {
            type = ch;
            writeAttak(piece.getAxisX(), piece.getAxisY());
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                str.append(temp[i][j]);
            }
            str.append('\n');
        }
        return str.toString();
    }

    private void writeAttak(int axisX, int axisY) {
        int finish = 8;
        int start = 0;

        if (axisX - axisY >= 0 && type == 'D') {
            //finish=finish-(axisX - axisY);
            start += (axisX - axisY);
        } else if (axisX - axisY < 0 && type == 'D') {
            finish = finish + (axisX - axisY);
            //start= + (axisX - axisY);
        }

        for (int i = start; i < finish; i++) {
            if (type == 'V') {
                temp[i][axisY] = 'Х';
            } else if (type == 'G') {
                temp[axisX][i] = 'Х';
            } else if (type == 'D') {
                if (axisX - axisY >= 0) {
                    temp[i][i - (axisX - axisY)] = 'Х';
                } else {
                    temp[i][i + (axisY - axisX)] = 'Х';
                }
            }
        }
        if (type == 'D') {
            writeVerticalBack(axisX, axisY, temp);
        }
    }

    private void writeVerticalBack(int axisX, int axisY, char[][] temp) {
        int[] tempXY = {0, 0};  //поиск первого элемента i и j
        int countX = axisX;
        int countY = axisY;
        while (true) {
            if (countX >= 0 && countY <= 8) {
                tempXY[0] = countX--;
                tempXY[1] = countY++;
            } else {
                break;
            }

        }
        countX = tempXY[0];   //построение обратной диагонали
        countY = tempXY[1];
        while (true) {
            if (countX <= 8 && countY >= 0) {
                temp[countX++][countY--] = 'Х';

            } else {

                break;
            }
        }
    }


}

