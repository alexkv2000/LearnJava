package home.learn.academy.Test_ather;

import java.util.Scanner;

public class CresNull {
    public static void main(String[] args) {
        CrestClass cress = new CrestClass();
        cress.ShowMap();
        cress.ShowNextStep();
        cress.showBoard();
        //start loop
        while (true) {

            var num1 = new Scanner(System.in).nextLine().charAt(0);
            cress.add(num1, cress.getNextStep());
            cress.showBoard();

            if (cress.isWin()) {
                System.out.println("Победа!!!");
                if(cress.isWinToString()=='X') {
                    System.out.println("Компьютер");
                } else if (cress.isWinToString()=='O') {
                    System.out.println("Вы победили");
                }
                break;
            }
            if (cress.getSteps() == 9) {
                System.out.println("Ничья! Повторите еще раз...");
                break;
            }
            cress.ShowNextStep();

            var num2 = new Scanner(System.in).nextLine().charAt(0);
            cress.add(num2, cress.getNextStep());
            cress.showBoard();

            if (cress.isWin()) {
                System.out.println("Победа!!!");
                if(cress.isWinToString()=='X') {
                    System.out.println("Компьютер");
                } else if (cress.isWinToString()=='O') {
                    System.out.println("Вы победили");
                }
                break;
            }
            if (cress.getSteps() == 9) {
                System.out.println("Ничья! Повторите еще раз...");
                break;
            }
        }
    }

}
