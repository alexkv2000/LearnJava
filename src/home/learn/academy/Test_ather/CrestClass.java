package home.learn.academy.Test_ather;

import java.util.Random;

public class CrestClass {
    public char[][] map;
    public char[][] board;   //Игровая доска
    private int nextStep;       //Ход ПК = 1 или Пользователь
    private int steps;            //Всего ходов 0 .. 9

    public void add(char number, int nextStep) {
        steps++;
        SetNextStep();
        this.nextStep = nextStep;
        AcceptNumToBoard(number);

    }

    public int getNextStep() {
        if (nextStep == 1) {
            nextStep = 0;
        } else {
            nextStep = 1;
        }
        return nextStep;
    }


    private void AcceptNumToBoard(char number) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == number) {
                    board[i][j] = ShowStepChar();
                    System.out.println();
                    break;
                }
            }

        }
    }

    public void ShowMap() {
        System.out.println("Карта клавиш.");
        Show(map);
        System.out.println();
    }

    public void showBoard() {

        Show(board);
    }

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

    public CrestClass() {
        map = new char[][]{
                {'7', '8', '9'},
                {'4', '5', '6'},
                {'1', '2', '3'}
        };

        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        SetNextStep(new Random().nextBoolean());
    }

    private void SetNextStep(boolean bnextStep) {
        if (bnextStep) {
            nextStep = 1;
        } else {
            nextStep = 0;
        }
    }

    public void ShowNextStep() {
        if (nextStep == 1) {
            System.out.println("Ходит компьютер");
        } else {
            System.out.println("Ваш ход");
        }
    }

    private void SetNextStep() {
        if (nextStep == 1) {
            nextStep = 0;
        } else {
            nextStep = 1;
        }
    }

    private char ShowStepChar() {
        if (nextStep == 1) {
            return 'X';
        } else {
            return 'O';
        }

    }

    public int getSteps() {
        return steps;
    }

    public void WinToString() {
        if (isWin()) {
            System.out.println(nextStep == 1 ? "Компьютер компьютер" : "Вы победили!!!");
        }
    }

    public boolean isWin() {
        boolean istina = false;
        for (int i = 0; i < 3; i++) {
            var sum1 = 0;
            var sum2 = 0;
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'X') {
                    sum1++;
                } else if (board[i][j] == 'O') {
                    sum2++;
                }
                if ((sum1 == 3) || (sum2 == 3)) {
                    istina = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            var sum1 = 0;
            var sum2 = 0;
            for (int j = 0; j < 3; j++) {
                if (board[j][i] == 'X') {
                    sum1++;
                } else if (board[j][i] == 'O') {
                    sum2++;
                }
                if ((sum1 == 3) || (sum2 == 3)) {
                    istina = true;
                }
            }
        }
        if ((board[0][0] == 'X') && (board[1][1] == board[0][0]) && (board[2][2] == board[0][0]) ||
                ((board[0][2] == 'X') && (board[1][1] == board[0][2]) && (board[2][0] == board[0][2])) ||
                ((board[0][0] == 'O') && (board[1][1] == board[0][0]) && (board[2][2] == board[0][0])) ||
                ((board[0][2] == 'O') && (board[1][1] == board[0][2]) && (board[2][0] == board[0][2]))) {
            istina = true;
        }
        if (istina) {
            return true;
        } else {
            return false;
        }
    }

    public char isWinToString() {
        if (nextStep == 1) {
            return 'X';
        } else {
            return 'O';
        }
    }


}


