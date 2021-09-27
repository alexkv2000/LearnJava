package CressZero;

import java.io.IOException;
import java.util.Random;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class TemplateUser implements TemplateGameCress {
    private final String name;

    char[][] board;
    private char nextStep;
    private boolean isWin;
    private int count;

    public TemplateUser(final String name) {
        this.name = name;

        this.isWin = false;
        this.nextStep = new Random().nextBoolean() ? 'X' : 'O';
        this.board = new char[3][3];
    }
    //

    private void Show(char[][] objarray) {
        System.out.println("-------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + objarray[i][j]);
            }
            System.out.println("|");
            System.out.println("-------");
        }
    }


    //

    char[][] mapKey = new char[][]{
            {'7', '8', '9'},
            {'4', '5', '6'},
            {'1', '2', '3'}
    };

    @Override
    public void showKeyTemplate() {
        System.out.println("Игра Крестики - Нолики");
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        Show(this.mapKey);
    }

    @Override
    public char getNextStep() {
        return this.nextStep;
    }

    @Override
    public String user() {
        return this.name;
    }

    @Override
    public boolean add(final int element, final char simbol) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Character.getNumericValue(this.mapKey[i][j]) == element) { //нашли нужный элемент
                    if (Character.valueOf(this.board[i][j]) == '\u0000') {
                        this.board[i][j] = simbol;
                        this.count++;
                        verifyWin();
                        return true;
                    } else if (Character.valueOf(this.board[i][j]) == 'X' && getNextStep() == 'X'
                            || Character.valueOf(this.board[i][j]) == 'O' && getNextStep() == 'X') {
                        System.out.println("Sorry! Try again. ");
                    } else {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    private void verifyWin() {
        if (board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != '\u0000') {
            this.isWin = true;
        } else if (board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] != '\u0000') {
            this.isWin = true;
        } else if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != '\u0000') {
            this.isWin = true;
        } else if (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != '\u0000') {
            this.isWin = true;
        } else if (board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != '\u0000') {
            this.isWin = true;
        } else if (board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] != '\u0000') {
            this.isWin = true;
        } else if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != '\u0000') {
            this.isWin = true;
        } else if (board[2][0] == board[1][1] && board[2][0] == board[0][2] && board[2][0] != '\u0000') {
            this.isWin = true;
        } else {
            this.isWin = false;
        }
    }

    @Override
    public void showTemplate() {
        Show(this.board);
    }

    @Override
    public boolean endGame() {
        if (count == 9 || this.isWin()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isWin(final char simbol) {
        if (this.isWin && simbol == getNextStep()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setNextStep() {
        this.nextStep = (nextStep == 'X') ? 'O' : 'X';
    }

    @Override
    public int count() {
        return this.count;
    }

    @Override
    public boolean isWin() {
        return this.isWin;
    }

}
