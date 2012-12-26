package project11;

import java.util.Scanner;

/**
 *
 * @author bipleash
 */
public class CoLinear {

    private int k = 5;
    private int h;
    private double x;
    private double y;
    Points[] PointsArr = new Points[k];
    Scanner myScanner = new Scanner(System.in);

    public void PointGetter() {

        do {
            System.out.println("How many points want you check:");
            k = myScanner.nextInt();
            System.out.println("Enter point x" + h);
            x=myScanner.nextDouble();
            System.out.println("Enter point y"+h);
            y=myScanner.nextDouble();
            Points myPoints=new Points(x,y);
            myPoints.setX(x);
            myPoints.setY(y);
            PointsArr[h]=myPoints;
        } while (h < PointsArr.length);

    }
    
    public void ColinearCheck(){
        
    
    
    }
    
    
}