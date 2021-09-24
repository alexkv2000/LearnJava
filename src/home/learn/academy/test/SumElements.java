package home.learn.academy.test;

import java.sql.Array;
import java.util.Scanner;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class SumElements {
    public static void main(String[] args) {
        int sizeArray = new Scanner(System.in).nextInt();

        StructureSum structureSum = new Sum((sizeArray/5 + (sizeArray%5!=0?1:0)) * 5);
        for (int i = 0; i < sizeArray; i++) {
            structureSum.add(i+1);
        }

        System.out.println(structureSum.asString());
        System.out.println(structureSum.getCurrentElement());
        System.out.println(structureSum.sum());
        structureSum.add(0,5);
        System.out.println(structureSum.asString());
        System.out.println(structureSum.sum());
        System.out.println(structureSum.getCurrentElement());
    }


}
