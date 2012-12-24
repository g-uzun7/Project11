/*
 * This class calculates slope of perpendicular line from given equation.
 * It makes it by calling EqAnalyzer from SlopeEq class and
 * and return it's slope value in _SlopeGetter method and then CalcPerpSlope method
 * gets this value and calculates perpendicular slope by m1*m2=-1 formula.
 */
package project11;

/**
 *
 * @author bipleash
 */
public class SlopePerp {

    private String myEquation;
    private float _Slope;
    private float PerpSlope;
    private float moiSlope;

    public SlopePerp(String myEquation) {
        this.myEquation = myEquation;
    }

    private float _SlopeGetter() {
        SlopeEq gSlope = new SlopeEq(myEquation);
        _Slope = gSlope.EqAnalyzer();
        return _Slope;
    }

    public float CalcPerpSlope() {
        moiSlope = _SlopeGetter();
        PerpSlope = (-1) / moiSlope;
        return PerpSlope;
    }
}
