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
    private String myChar;
    String[] SlopStr = new String[10];
    private String obo;

    public SlopeEq(String _formula) {
        this._formula = _formula;
    }
    /*   In this part EqAnalyzer scans equation until 'x',
     * when x has found it scans equation back until '='
     * in the same time saves the characters between '='
     * and 'x' to the SlopStr array.In the end a for loop
     * scans array and prints slope value.
     */

    public int EqAnalyzer() {
        for (int k = 0; k < _formula.length(); k++) {
            obo = _formula.substring(k);
            if ("x".equals(obo)) {
                System.out.println("OK");
                for (int l = k; l > 0; k--) {
                    obo = _formula.substring(l);
                    System.out.println(k);
                    SlopStr[k] = obo;
                    if ("=".equals(obo)) {
                        break;
                    }
                }
            }
        }
        for (int u = 0; u < SlopStr.length; u++) {
            System.out.printf("%s", SlopStr[u]);
        }
        return 0;
    }
}//END
