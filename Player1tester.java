
import java.util.ArrayList;

import java.util.Scanner;
/**
 * Write a description of class Player1tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player1tester
{
    public static void main(String [] args)
    { Player1 p1 = new Player1();
       int v0 = p1.getLaunchVelocity();
        System.out.println(v0);
        int vf = p1.getLandVelocity();
        System.out.println(vf);
         int x = p1.getDisplacement();
        System.out.println(x);
         int theta = p1.getAngle();
        System.out.println(theta);
         String pname = p1.getPlayer();
         System.out.println(pname);
         
         String tname = p1.getTeam();
         System.out.println(tname);
        
         System.out.println(p1);
         
         
    }
}

    
