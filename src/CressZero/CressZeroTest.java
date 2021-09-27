package CressZero;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class CressZeroTest {
    public static void main(String[] args) {

        TemplateGameCress template = new TemplateUser("Alexey");
        template.showKeyTemplate();

        boolean flag = false; // успешно добавлен элемент
        int step = 0;
        if (template.getNextStep() == 'X') {
            System.out.println("Ход " + template.user() + " : ");

            while (!flag) {
                // System.out.println("Не корректное значение, повторите еще раз : ");
                flag = template.add(new Scanner(System.in).nextInt(), template.getNextStep());
            }
        } else {            //ход робота
            while (!flag) {
                flag = template.add(new Random().nextInt(8) + 1, template.getNextStep());
            }
        }

        template.showTemplate();


        // игра началась
        while (!template.endGame() || template.isWin()) {
            template.setNextStep();
            flag = false;
            if (template.getNextStep() == 'X') {
                System.out.println("Ход " + template.user() + " : ");

                while (!flag) {
                    // System.out.println("Не корректное значение, повторите еще раз : ");
                    flag = template.add(new Scanner(System.in).nextInt(), template.getNextStep());
                }
            } else {            //ход робота
                while (!flag) {
                    flag = template.add(new Random().nextInt(8) + 1, template.getNextStep());
                }
                template.showTemplate();
            }


            if (template.isWin('X')) {
                template.showTemplate();
                System.out.println("YOU WIN! ");
                break;
            } else if (template.isWin('O')) {
                System.out.println("COMPUTER WIN! ");
                break;
            } else if (template.count() >= 9) {
                template.showTemplate();
                System.out.println("Sorry, DRAW! ");
                break;
            }


        }
        //конец игры
        System.out.println("GAME OVER!");
    }
}