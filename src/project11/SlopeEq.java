/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project11;

import java.util.Scanner;
//import java.io.StringReader;

/**
 *
 * @author bipleash
 */
public class SlopeEq {
    
    private String _formula;// = new String("-y=-2x+1");
    private String myChar;
    private boolean isEqual;
    private Scanner moiScanner = new Scanner(_formula);
    
    private String obo;

    public SlopeEq(String _formula) {
        this._formula = _formula;
    }
    
    public int EqAnalyzer() {
        for (int k = 0; k < _formula.length(); k++) {
            obo=_formula.substring(k);
            isEqual = "x".equals(obo);
            if (isEqual) {
                System.out.println("TEST DONE");
            }
        }
    return 0;
    }



}//END
