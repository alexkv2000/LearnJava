package home.learn.lyceum.Chek;

import home.learn.lyceum.Chek.Template.Template;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class ChekDeskTest {
    public static void main(String[] args) {
        Board board = new Board(); // Одна доска для всех
        Piece king = new Piece("black", 'K');  //  "Король"
        Piece queen = new Piece("white", 'Q');  // "Королева"
        //      Piece rook = new Piece("white",'R');   // "Ладья"
        //       Piece pawn = new Piece("white",'P');   // "Пешка"

        board.addElement(king); //вывод на доску объекта
        board.addElement(queen);
        //       board.addElement(pawn);
        //      board.addElement(rook);

        System.out.println(board.showBoard());
        System.out.println();
        //Создать шаблоны
        Template templateRook = new Template();
        //      templateRook.addTemplate(rook, 'V');
        //      templateRook.addTemplate(rook, 'G');

        templateRook.addTemplate(queen, 'V');
        templateRook.addTemplate(queen, 'G');
        templateRook.addTemplate(queen, 'D');
//        templateRook.addTemplate(queen,'B');
        System.out.println(templateRook.toString());

        if (isMat(templateRook.temp, king)) {
            System.out.println("CheckMat!");
        } /*else if (isСheck(templateRook.temp, king)) {
            System.out.println("Check");
        }*/

    }

    private static boolean isMat(char[][] temp, Piece piece) {

        int i = (piece.getAxisX()-1==-1)?piece.getAxisX():piece.getAxisX()-1;
        int j = (piece.getAxisY()-1==-1)?piece.getAxisY():piece.getAxisY()-1;
        int endx = (piece.getAxisX()+1==9)?2:3;
        int endy = (piece.getAxisY()+1==9)?2:3;
        char[][] tempT = new char[3][3];
        for (int k = (piece.getAxisX()-1==-1)?2:1; k <= endx; k++) {
            for (int m = (piece.getAxisY()-1==-1)?2:1; m <= endy; m++) {
                System.out.print("_"+temp[i][j]);

                tempT[k][m] = temp[i][j];
                if(temp[i][j++]=='\u0000'){

                    return false;
                }

            }
            i++;
            j=(piece.getAxisY()-1==-1)?piece.getAxisY():piece.getAxisY()-1;
            System.out.println("*");
        }
        return true;
    }

    //i--,j--  i--,j  i--,j++
    //i  ,j--  i,  j  i  ,j++
    //i++,j--  i++,j  i++,j++


}