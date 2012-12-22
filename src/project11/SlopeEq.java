/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project11;

//import java.util.Scanner;
/**
 *
 * @author bipleash
 */
public class SlopeEq {

    private String _formula;
    char[] SlopChr=new char[10];
    private String obo;
    float number;
    
    public SlopeEq(String _formula) {
        this._formula = _formula;
    }
    /*   In this part EqAnalyzer scans equation until 'x',
     * when x has found it scans equation back until '='
     * in the same time saves the characters between '='
     * and 'x' to the SlopStr array.In the end a for loop
     * scans array and prints slope value.
     */

    public float EqAnalyzer() {
        for (int k = 0; k < _formula.length(); k++) {
            char oba = _formula.charAt(k);//read char at k
            if ('x'==oba) {//checks whether x equal char at k in formula
                for (int l = k-1; l > 1; l--) {
                    oba = _formula.charAt(l);
                    SlopChr[l] = oba;
                    if ('='==oba) {
                        break;
                    }
                }
            }
        }
        /*
         * This part prints slope.
         */
        String myEquation = new String(SlopChr);
        obo = myEquation;
        number = Float.parseFloat(obo);
        return number;
    }
}//END
