package home.learn.lyceum.Chek;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class Board {
    String board = "";
    char [][] array = new char[8][8];
    Axis axis = new Axis();

    public boolean isEmpty(Axis array){
        if (this.array[array.getAxisX()][array.getAxisY()] == ' '){
            return true;
        }
        return false;
    }

    public void addElement(Axis array, char element) {
        this.array[array.getAxisX()][array.getAxisY()] = element;
    }

    public void addElement(int i, Axis axisY, char element) {
        this.array[i][axisY.getAxisY()] = element;
    }

    public void addElement(int[] array, char element) {
        this.array[array[0]][array[1]]= element;
    }

    public void addElement(Piece piece) {
        this.array[piece.getAxisX()][piece.getAxisY()] = piece.Simmbol;
    }

    public String showBoard() {
        StringBuilder newBoard = new StringBuilder();
        newBoard.append("  |---------------|\n");

        for (int i = 0; i < this.array.length; i++) {
            newBoard.append(i+1 +" |");
            for (int j = 0; j < this.array.length; j++) {
                    newBoard.append((this.array[i][j]==0?" ": this.array[i][j]) + "|");
            }
            newBoard.append("\n");
            newBoard.append("  |---------------|\n");
        }
        newBoard.append("   1 2 3 4 5 6 7 8\n");
        board=newBoard.toString();
        return board;
    }

}