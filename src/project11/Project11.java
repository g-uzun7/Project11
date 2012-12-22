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
public class Project11 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int n;
        int sayi1, sayi2, sayi3, sayi4;
        String _EQ;
        Scanner myScanner = new Scanner(System.in);



        do {
            String[] _MENU = {"Math Problem Solver", "1.Find the slope of a line from points", "2.Check your points co-linear or not", "3.Find the slope of a line given by equation", "4.Find the slope of a line perpendicular to your line", "5.Test your points triangularity", "6.Exit"};
            //MENU WRITTEN IN TO ARRAY
            for (int i = 0; i < 7; i++) {
                System.out.println(_MENU[i]);
            }
            System.out.println("Make your choice:");
            n = myScanner.nextInt();
            switch (n) {
                case 1:
                    //slope from points
                    System.out.println("Enter points like this : x1,x2,y1,y2");
                    sayi1 = myScanner.nextInt();
                    sayi2 = myScanner.nextInt();
                    sayi3 = myScanner.nextInt();
                    sayi4 = myScanner.nextInt();
                    Slope mypoints = new Slope(sayi1, sayi2, sayi3, sayi4);
                    mypoints.SlopePoints();
                    break;
                case 2:
                    //co-linear points

                    break;

                case 3:
                    //slope of line 
                    System.out.println("Enter equation:");
                    _EQ = myScanner.next();
                    SlopeEq myEq = new SlopeEq(_EQ);
                    System.out.printf("%s\n", myEq.EqAnalyzer());
                    break;

                case 4:
                    //slope of perpendicular line
                    System.out.println("Enter equation:");
                    _EQ=myScanner.next();
                    SlopePerp myPerpSlope=new SlopePerp(_EQ);
                    System.out.printf("%s\n",myPerpSlope.CalcPerpSlope());
                    break;
                case 5:
                    //triangle
                    break;
                case 6:
                    //exit
                    break;
                default:
                    break;
            }


        } while (n != 6);
    }
}
