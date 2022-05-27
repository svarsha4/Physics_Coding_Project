
/**
 * Write a description of class Planettester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planettester
{
    public static void main(String [] args)
    {
    Player1 p1 = new Player1();
    Player2 p2 = new Player2();
        Planet mars = new Planet(p1, p2);
        String calc = mars.getAccelerationEquation1();
        String calc2 = mars.getAccelerationEquation2();
        int two = mars.getTwo1();
        System.out.println(two);
        int one = mars.getOne1();
        System.out.println(one);
        int zero = mars.getZero1();
        System.out.println(zero);
        int two2 = mars.getTwo2();
        System.out.println(two2);
        int one2 = mars.getOne2();
        System.out.println(one2);
        int zero2 = mars.getZero2();
        System.out.println(zero2);
        
        System.out.println(calc);
        System.out.println(calc2);
        String question = mars.getQuestion();
        System.out.println(question);
     Player1 player1 = mars.getPlayer1();
     System.out.println(player1);
     Player2 player2 = mars.getPlayer2();
     System.out.println(player2);
     System.out.println(mars);
}
}


    
   
