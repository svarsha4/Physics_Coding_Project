
import java.util.ArrayList;

import java.util.Scanner;
/**
 * The planet object is meant to consist of all the information thatg will be important for the game, such as the questions that will be used by the players
 * Also, just like Earth has universal acceleration which is gravity, this planet will have acceleration that is varied and expressed into an equation as a function of time
 *Saul Varshavsky
 * @version (a version number or a date)
 */
public class Planet 
{

    private ArrayList<Integer> acceleration;

    private String [] question = {"What is the launch angle?","What is the final velocity?","What is the initial velocity?","What is the horizontal displacement?"};
    private Player1 player1;
    private Player2 player2;
    private int q;

    /**
     * @param,: Player1 p1, Player2 p2
     * initializes each instance variable of each type of player object to p1 and p2
     * creates a new array list that contains values that will form an acceleration equation
     * asks user to decide on the index of the question array
     */public Planet(Player1 p1, Player2 p2)
    {
         player1 = p1;
         player2 = p2;

        acceleration = new ArrayList<Integer>();
        int i = 0;
        while( i < 3 )
        {
            acceleration.add((int)(Math.random()*25+(i+1)));
            i++;
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.println("There are 4 questions. Both players should decide on and choose the question number they would like to answer");
         q = scan.nextInt();

        
    }

    
    /**
     * @param: none
     * creates an acceleration equation using the elements of the acceleration array in the format
     * bt^2 + ct - d where b,c,and d are elements from the acceleration array
     * @return: String representing the acceleration equation for player1
     */public String getAccelerationEquation1()
    {
        int two = 0;
        int one = 0;
        int zero = 0;
        for(int i = 0; i < acceleration.size(); i++)
        {
            if(i == 0)
            {
                two = acceleration.get(i);
            }
            else if(i == 1)
            {
                one = acceleration.get(i);
            }
            else if(i == 2)
            {
                zero = acceleration.get(i);
            }
        }
        String function = "" + two + "t^2 + " + one + "t - " + zero;
        return function;
    }
    /**
     * @param: none
     * @return: b from the acceleration equation for player1
     */public int getTwo1()
    {
         return acceleration.get(0);
    }
    /**
     * 
     * @param: none
     * @return: c from the acceleration equation for player1
     */public int getOne1()
    {
        return acceleration.get(1);
    }
     /**
      * 
     * @param: none
     * @return: d from the acceleration equation for player1
      */public int getZero1()
    {
        return acceleration.get(2);
    }
     /**
      * 
     * @param: none
     * @return: b from the acceleration equation for player2
      */public int getTwo2()
    {
        return acceleration.get(2);
    }
    /**
     * 
     * @param: none
     * @return: c from the acceleration equation for player2
     */public int getOne2()
    {
        return acceleration.get(0);
    }
    /**
     * 
     * @param: none
     * @return: d from the acceleration equation for player2
     */public int getZero2()
    {
        return acceleration.get(1);
    }
    

    /**
     * @param: none
     * creates an acceleration equation using the elements of the acceleration array in the format
     * bt^2 + ct - d where b,c,and d are elements from the acceleration array
     * @return: String representing the acceleration equation for player2
     */public String getAccelerationEquation2()
    {
        int two = 0;
        int one = 0;
        int zero = 0;
        for(int i = 0; i < acceleration.size(); i++)
        {
            if(i == 0)
            {
                one = acceleration.get(i);
            }
            else if(i == 1)
            {
                zero = acceleration.get(i);
            }
            else if(i == 2)
            {
                two = acceleration.get(i);
            }
        }
        String function = "" + two + "t^2 + " + one + "t - " + zero;
        return function;
    }

    /**
     * @param: none
     * @return: player1 object
     */public Player1 getPlayer1()
    {
        return player1;
    }

    /**
     * @param: none
     * @return: player2 object
     */public Player2 getPlayer2()
    {
        return player2;
    }

    /**
     * @param: none
     * @return: the index of the question the user chose
     * Note: The user's chosen index actually gets returned as index-1 so as not to confuse the user
     * If a user has no programming experience, it will make sense for the user to not choose index 0
     */public String getQuestion()
    {
        
        return question[q-1];

       

    }

    
    

    /**
     * @param: none
     * @return: String representing all the important information for the planet object
     */public String toString()
    {

        String planetinfo = " Acceleration Equation for " + getPlayer1().getPlayer() + ": " + getAccelerationEquation1() + " Acceleration Equation for " + getPlayer2().getPlayer() + ": " + getAccelerationEquation2() +  " Your question is: " + getQuestion();
        return planetinfo;

    }
}

