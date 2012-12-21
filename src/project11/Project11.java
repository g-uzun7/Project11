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
    public static void main(String[] args) {
        int n;
        int sayi1,sayi2,sayi3,sayi4;
        String _EQ;
        Scanner myScanner=new Scanner(System.in);
        
        
  
        do{
            System.out.println("Math Problem Solver \n 1.Find the slope of a line from points \n 2.Check your points co-linear or not\n3.Find the slope of a line given by equation");
            System.out.println("4.Find the slope of a line perpendicular to your line");
            System.out.println("5.Test your points triangularity");
            //EDIT HERE
            System.out.println("Make your choice:");
            n=myScanner.nextInt();
            switch(n){
                case 1:
                    //slope from points
                    System.out.println("Enter points like this : x1,x2,y1,y2");
                    sayi1=myScanner.nextInt();
                    sayi2=myScanner.nextInt();
                    sayi3=myScanner.nextInt();
                    sayi4=myScanner.nextInt();
                    Slope mypoints=new Slope(sayi1, sayi2, sayi3, sayi4);
                    mypoints.SlopePoints();
                    break;
                case 2:
                    //co-linear points
                    
                    break;
                    
                case 3:
                    //slope of line 
                    System.out.println("Enter equation:");
                    _EQ=myScanner.next();
                    SlopeEq myEq=new SlopeEq(_EQ);
                    System.out.printf("%s\n",myEq.EqAnalyzer());
                    break;
                    
                case 4:
                    //slope of perpendicular line
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
            
        
        }while(n!=6);
    }
}
