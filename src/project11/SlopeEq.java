/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project11;

import java.util.Scanner;

/**
 *
 * @author bipleash
 */
public class SlopeEq {

    private String _formula;
    private String myChar;
    private Scanner moiScanner = new Scanner(_formula);
    private boolean isEqual;
    int mylength = _formula.length();
    //private int k;
    private String obo;
    String a = new String("x");

    public void EqAnalyzer() {
        for (k = 0; k < _formula; k++) {
            obo = moiScanner.substring(k);
            //obo=moiScanner.next(k);
            isEqual = "x".equals(obo);
            if (isEqual) {
            }
        }
    }
}
