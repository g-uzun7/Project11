/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project11;

/**
 *
 * @author bipleash
 */
public class Slope {
    private int x1,x2,y1,y2;
    private double _slope;

    public Slope(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public void SlopePoints(){
        _slope=(y2-y1)/(x2-x1);
        System.out.println(_slope);
        //return _slope;
    }

    
}
