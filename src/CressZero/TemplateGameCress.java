package CressZero;

import java.io.IOException;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public interface TemplateGameCress {

    void showKeyTemplate();

    char getNextStep();

    String user();

    boolean add(int element, char simbol);

    void showTemplate();

    boolean endGame();

    boolean isWin(char simbol);

    void setNextStep();

    int count();

    boolean isWin();
}
