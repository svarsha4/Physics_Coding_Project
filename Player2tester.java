
/**
 * Write a description of class Player2tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player2tester
{
    public static void main(String [] args)
    { 
        Player2 p2 = new Player2();
        int v0 = p2.getLaunchVelocity();
        System.out.println(v0);
        int vf = p2.getLandVelocity();
        System.out.println(vf);
         int x = p2.getDisplacement();
        System.out.println(x);
        int theta = p2.getAngle();
        System.out.println(theta);
          String pname = p2.getPlayer();
          System.out.println(pname);
         
          String tname = p2.getTeam();
          System.out.println(tname);
        
          System.out.println(p2);
    }
}