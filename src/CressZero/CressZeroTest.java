package CressZero;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Locale;
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
                flag = isAddTurn(template);
            }
        } else {            //ход робота
            while (!flag) {
                flag = template.add(new Random().nextInt(8) + 1, template.getNextStep());
            }
        }

        template.showTemplate();

        while (!template.endGame() || template.isWin()) {
            template.setNextStep();
            flag = false;
            if (template.getNextStep() == 'X') {
                System.out.println("Your turn " + template.user() + " : ");
                while (!flag) {
                    flag = isAddTurn(template);
                }
            } else {            //ход робота
                while (!flag) {
                    flag = isAddTurn(template);
                }
                template.showTemplate();
            }


            if (template.isWin('X')) {
                template.showTemplate();
                System.out.println(template.user().toUpperCase(Locale.ROOT) + " WIN! ");
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

    private static boolean isAddTurn(final @NotNull TemplateGameCress template) {
        int number = 0;
        if (template.getNextStep() == 'X') {
            number=new Scanner(System.in).nextInt();
        } else if (template.getNextStep() == 'O') {
            number = new Random().nextInt(8) + 1;
        }
        return template.add(number, template.getNextStep());
    }
}